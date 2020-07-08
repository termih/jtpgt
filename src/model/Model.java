/*
Copyright (C) 2016-2020
András Sallai

Written by:
András Sallai <termih@gmail.com>, 2016, 2019, 2020

This file is part of Tpgt.

Tpgt is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
*/

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

public class Model {

    public String programName = "jTpgt";
    public String programVersion = "1.0.0";

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

    public void repeatLesson() {
        if(!this.lessonFileName.equals("")) {
            this.loadLesson(this.lessonFileName);
        }else {
            JOptionPane.showMessageDialog(mainwindow,
            mainwindow.con.bundle.getString("NoLessonsLoad")
            );
        }

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

        mainwindow.lineTextPane.setText(lessonLines.get(0));

        setCharColor(0, Color.orange);
        Integer lessonCount = lessonLines.size();
        mainwindow.worktable.statuspanel.rowCountField.setText(
                mainwindow.con.bundle.getString("countOfLine")
                + ": "+ lessonCount.toString());
        mainwindow.worktable.statuspanel.actualRowField.
            setText(
            mainwindow.con.bundle.getString("ActualLine")
            + ": 1"
            );
        mainwindow.worktable.statuspanel.errorField.
            setText(
            mainwindow.con.bundle.getString("Error")
            + ": 0"
            );
        actualLine = 0;
        actualIndex = 0;
        mainwindow.worktable.progresspanel.progressBar.
            setMaximum(lessonLength);
        mainwindow.worktable.progresspanel.progressBar.setMinimum(0);
        mainwindow.worktable.progresspanel.progressBar.setValue(0);
        lessonPointer = 0;
        String helperFilename = lessonFnameToHelperFname(lessonFileName);
        this.loadHelptext(helperFilename);
        mainwindow.worktable.textpanel.tcon.maxSpeed = 0;
        mainwindow.worktable.textpanel.tcon.timer.start();
        mainwindow.worktable.cmdpanel.helperTextPane.setCaretPosition(0);
        mainwindow.worktable.charpanel.charField.setText("");
        mainwindow.worktable.charpanel.lessonLabel.setText(lessonFileName);
    }

    public void loadLesson(String lessonFileName) {
        try {
            tryLoadLesson(lessonFileName);
        } catch (FileNotFoundException ex) {
            System.err.println("Error! File not found!");
        } catch (IOException ex) {
            System.err.println("Error! Close file, failed!");
        }
    }

    public void setCharColor(int index, Color color) {
        StyledDocument doc = mainwindow.worktable.textpanel.lineTextPane.getStyledDocument();
        SimpleAttributeSet keyChar = new SimpleAttributeSet();
        StyleConstants.setBackground(keyChar, color);
        doc.setCharacterAttributes(index, 1, keyChar, true);
    }

    public void loadHelptext(String helperFileName) {
        try {
            tryLoadHelptext(helperFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error! The helper file not found! " +
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
