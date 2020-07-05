package model;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import view.Mainwindow;

/**
 *
 * @author Sallai András
 */
public class Model {

    String applicationVersion = "0.8.0";
    String applicationName = "jTpgt";
    String applicationAuthor = "Sallai András";
    String applicationCopyright = "Copyright (c) Sallai András, 2016, 2019, 2020";
    String applicationLicenc = "GNU GPL v3";

    Mainwindow mainwindow;

    public ArrayList<String> lessonLines = new ArrayList<>();

    public int actualIndex = 0;
    public int actualLine = 0;
    public Integer badPoint = 0;
    public int lessonLength = 0;
    public int lessonPointer = 0;

    public String lessonFileName;
    public String lessonsLanguage="Hungarian";

    public Model(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.lessonFileName = "";
    }

    public void setLessonsLanguage(String lessonsLanguage) {
        this.lessonsLanguage = lessonsLanguage;
    }

    public void aboutBoxShow() {
        ImageIcon imageIcon = new ImageIcon("images/gtpgt.ico");
        JOptionPane.showMessageDialog(
                mainwindow,
                applicationName
                + " "
                + applicationVersion
                + "\n"
                + "Author: "
                + applicationAuthor
                + "\n"
                + applicationCopyright
                + "\n"
                + applicationLicenc,
                 "About",
                JOptionPane.INFORMATION_MESSAGE,
                imageIcon);
    }

    public void repeatLesson() {
        this.loadLesson(this.lessonFileName);
    }

    private String convertToLeadingZero(Integer lessonNumber) {
            Formatter formatter = new Formatter();
            String strLessonNumber =
                formatter.format("%02d", lessonNumber).toString();
            formatter.close();
        return strLessonNumber;
    }

    private int getLessonNum(String lessonFileName) {
        String strLessonNumber = lessonFileName.substring(6, 8);
        int lessonNumber = Integer.parseInt(strLessonNumber);
        return lessonNumber;
    }

    public void loadPreviousLesson() {
        if(isLessonLoaded() && !isLoadedLessonFirst()) {
            int lessonNumber = getLessonNum(this.lessonFileName);
            String newLessonFileName = "lesson" +
                    this.convertToLeadingZero(--lessonNumber);
            loadLesson(newLessonFileName);
        }else {
            loadLesson("lesson42");
        }
    }

    public void loadNextLesson() {
        if (isLessonLoaded() && !isLoadedLessonLast()) {
            int lessonNumber = getLessonNum(this.lessonFileName);
            String newLessonFileName = "lesson" +
                this.convertToLeadingZero(++lessonNumber);
            loadLesson(newLessonFileName);
        }else {
            loadLesson("lesson01");
        }
    }

    private boolean isLessonLoaded() {
        if(this.lessonFileName.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }

    private boolean isLoadedLessonLast() {
        if(this.lessonFileName.equals("lesson42")) {
            return true;
        }else {
            return false;
        }
    }

    private boolean isLoadedLessonFirst() {
        if(this.lessonFileName.equals("lesson01")) {
            return true;
        }else {
            return false;
        }
    }

    private String lessonFnameToHelperFname(String lessonFileName) {
        String helperFilename = "";
        int lessonNumber = getLessonNum(this.lessonFileName);
        helperFilename = "helper" +
            this.convertToLeadingZero(lessonNumber);
        return helperFilename;
    }

    public void tryLoadLesson(String lessonFileName)
            throws FileNotFoundException, IOException {
        this.lessonFileName = lessonFileName;
        // this.mainwindow.setTitle(lessonFileName);
        lessonLines.clear();
        String lessonPath = "lessons/" + lessonsLanguage +
            "/" + lessonFileName;



        FileReader fr = new FileReader(lessonPath);
        Scanner sc = new Scanner(fr);
        lessonLength = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lessonLines.add(line);
            lessonLength += line.length() - 1;
        }
        fr.close();



        // mainwindow.lineTextPane.setText(lessonLines.get(0));
        mainwindow.worktable.textpanel.lineTextPane.setText(lessonLines.get(0));

System.out.println("--------valami----------");


        setCharColor(0, Color.orange);
        Integer lessonCount = lessonLines.size();
        // mainwindow.rowCountField.setText(
        //         "Sorok száma: " + lessonCount.toString());
        mainwindow.worktable.statuspanel.rowCountField.setText(
                "Sorok száma: " + lessonCount.toString());
        // mainwindow.actualRowField.setText("Aktuális sor: 1");
        mainwindow.worktable.statuspanel.actualRowField.
            setText("Aktuális sor: 1");
        mainwindow.worktable.statuspanel.errorField.
            setText("Hiba: 0");
        actualLine = 0;
        actualIndex = 0;
        // mainwindow.lessonProgressBar.setMaximum(lessonLength);
        mainwindow.worktable.progresspanel.progressBar.
            setMaximum(lessonLength);
        mainwindow.worktable.progresspanel.progressBar.setMinimum(0);
        mainwindow.worktable.progresspanel.progressBar.setValue(0);
        lessonPointer = 0;
        String helperFilename = lessonFnameToHelperFname(lessonFileName);
        this.loadHelptext(helperFilename);
        // mainwindow.charTextField.setText("");
        mainwindow.worktable.charpanel.charField.setText("");
    }

    public void loadLesson(String lessonFileName) {
        try {
            tryLoadLesson(lessonFileName);
        } catch (FileNotFoundException ex) {
            System.err.println("Hiba! A fájl nem található!");
        } catch (IOException ex) {
            System.err.println("Hiba! A fájl bezárása sikertelen!");
        }
    }

    public void setCharColor(int index, Color color) {
        // StyledDocument doc = mainwindow.lineTextPane.getStyledDocument();
        StyledDocument doc = mainwindow.worktable.textpanel.lineTextPane.getStyledDocument();
        SimpleAttributeSet keyChar = new SimpleAttributeSet();
        StyleConstants.setBackground(keyChar, color);
        doc.setCharacterAttributes(index, 1, keyChar, true);
    }

    public void loadHelptext(String helperFileName) {
        try {
            tryLoadHelptext(helperFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A helper fájl nem található! " +
                    helperFileName);
        }
    }

    public void tryLoadHelptext(String helperFileName)
            throws FileNotFoundException {
        mainwindow.worktable.cmdpanel.helperTextPane.setText("");
        File file = new File(getHelperFilePath(helperFileName));
        Scanner sc = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()) {
            String line = sc.nextLine();
            sb.append(line);
            sb.append("\n");
        }
        mainwindow.worktable.cmdpanel.helperTextPane.setText(sb.toString());
    }

    public String getHelperFilePath(String helperFileName) {
        String helperPath = "lessons/" + lessonsLanguage +
            "/" + helperFileName;
        return helperPath;
    }
}
