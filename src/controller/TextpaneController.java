package controller;

import java.awt.event.KeyEvent;
import java.awt.Color;
import model.Model;
import view.Mainwindow;

public class TextpaneController {

    boolean enter = false;
    Mainwindow mainwindow;
    Model model;

    public TextpaneController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.model = new Model(mainwindow);
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
        } else if ('⏎' == model.lessonLines.get(model.actualLine).charAt(model.actualIndex)) {
            Integer lessonSize = model.lessonLines.size();
            if (model.actualLine < lessonSize-1) {
                model.actualLine++;
                model.actualIndex = 0;
                mainwindow.worktable.textpanel.lineTextPane.setText(
                        model.lessonLines.get(model.actualLine));
                model.setCharColor(0, Color.orange);
                mainwindow.worktable.statuspanel.actualRowField.setText("Aktuális sor: "+String.valueOf(model.actualLine+1));
                mainwindow.worktable.charpanel.charField.setText("⏎");
            }else {
                javax.swing.JOptionPane.showMessageDialog(mainwindow, "Vége");
                mainwindow.worktable.charpanel.charField.setText("");
                mainwindow.worktable.textpanel.lineTextPane.setText("");
            }
        }
    }

    public void checkTypedChar(char ch) {
        if (ch == model.lessonLines.get(model.actualLine).charAt(model.actualIndex)) {
            model.setCharColor(model.actualIndex, Color.white);
            model.actualIndex++;
            model.setCharColor(model.actualIndex, Color.orange);
            model.lessonPointer++;
            mainwindow.worktable.progresspanel.progressBar.setValue(model.lessonPointer);
        } else {
            model.setCharColor(model.actualIndex, Color.red);
            badPoint();
        }
    }

    public void badPoint() {
        model.badPoint++;
        mainwindow.worktable.statuspanel.errorField.setText("Hiba: " + model.badPoint.toString());
    }

}
