package controller;

import java.awt.event.KeyEvent;
import java.awt.Color;
import view.Mainwindow;

public class TextpaneController extends Controller {

    boolean enter = false;
    Mainwindow mainwindow;

    public TextpaneController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public void lineTextPaneKeyPressed(KeyEvent evt) {
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            enter = true;
        } else {
            enter = false;
        }
    }

    public void formKeyTyped(KeyEvent evt) {
        if (!enter) {
            char ch = evt.getKeyChar();
            mainwindow.worktable.charpanel.charField.setText(String.valueOf(ch));

            checkTypedChar(ch);
        } else if ('⏎' == mainwindow.model.lessonLines.get(mainwindow.model.actualLine).charAt(mainwindow.model.actualIndex)) {
            Integer lessonSize = mainwindow.model.lessonLines.size();
            if (mainwindow.model.actualLine < lessonSize-1) {
                mainwindow.model.actualLine++;
                mainwindow.model.actualIndex = 0;
                mainwindow.worktable.textpanel.lineTextPane.setText(
                        mainwindow.model.lessonLines.get(mainwindow.model.actualLine));
                mainwindow.model.setCharColor(0, Color.orange);
                mainwindow.worktable.statuspanel.actualRowField.setText("Aktuális sor: "+String.valueOf(mainwindow.model.actualLine+1));
                mainwindow.worktable.charpanel.charField.setText("⏎");
            }else {
                javax.swing.JOptionPane.showMessageDialog(mainwindow, "Vége");
                mainwindow.worktable.charpanel.charField.setText("");
                mainwindow.worktable.textpanel.lineTextPane.setText("");
            }
        }
    }

    public void checkTypedChar(char ch) {

        if (ch == mainwindow.model.lessonLines.get(mainwindow.model.actualLine).charAt(mainwindow.model.actualIndex)) {
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.white);
            mainwindow.model.actualIndex++;
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.orange);
            mainwindow.model.lessonPointer++;
            mainwindow.worktable.progresspanel.progressBar.setValue(mainwindow.model.lessonPointer);
        } else {
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.red);
            badPoint();
        }
    }

    public void badPoint() {
        mainwindow.model.badPoint++;
        mainwindow.worktable.statuspanel.errorField.setText("Hiba: " + mainwindow.model.badPoint.toString());
    }

}
