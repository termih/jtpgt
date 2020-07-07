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

package controller;

import java.awt.event.KeyEvent;
import java.awt.Color;
import view.Mainwindow;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextpaneController implements ActionListener {

    boolean enter = false;
    Mainwindow mainwindow;
    Integer keyCount;
    public Integer maxSpeed;
    public Timer timer;

    public TextpaneController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.keyCount = 0;
        this.maxSpeed = 0;
        timer = new Timer(10000, this);
    }

    public void actionPerformed(ActionEvent evt) {
        Integer speed = keyCount * 6;
        mainwindow.worktable.statuspanel.
            speedField.setText(
            mainwindow.con.bundle.getString("Speed")
             + ": " + speed.toString() + " " +
            mainwindow.con.bundle.getString("hitmin")
            );
        this.keyCount = 0;

        if(speed > this.maxSpeed) {
            this.maxSpeed = speed;
            mainwindow.worktable.statuspanel.
                maxSpeedField.setText(
                mainwindow.con.bundle.getString("maxspeed")
                + ": " + speed.toString() + " " +
                mainwindow.con.bundle.getString("hitmin")
                );
        }
    }

    public void lineTextPaneKeyPressed(KeyEvent evt) {
        this.keyCount++;
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            enter = true;
        } else {
            enter = false;
        }
    }

    public void formKeyTyped(KeyEvent evt) {
        if (!enter) {
            char ch = evt.getKeyChar();
            mainwindow.worktable.charpanel.charField.
                setText(String.valueOf(ch));

            checkTypedChar(ch);
        } else if ('⏎' == mainwindow.model.lessonLines.
                get(mainwindow.model.actualLine).
                charAt(mainwindow.model.actualIndex)) {
            Integer lessonSize = mainwindow.model.lessonLines.size();
            if (mainwindow.model.actualLine < lessonSize-1) {
                mainwindow.model.actualLine++;
                mainwindow.model.actualIndex = 0;
                mainwindow.worktable.textpanel.lineTextPane.setText(
                        mainwindow.model.lessonLines.get(mainwindow.model.actualLine));
                mainwindow.model.setCharColor(0, Color.orange);
                mainwindow.worktable.statuspanel.actualRowField.
                    setText(
                    mainwindow.con.bundle.getString("ActualLine") +": "
                    + String.valueOf(mainwindow.model.actualLine+1));
                mainwindow.worktable.charpanel.charField.setText("⏎");
            }else {
                javax.swing.JOptionPane.showMessageDialog(
                    mainwindow,
                    mainwindow.con.bundle.getString("Endoflesson")
                    );
                mainwindow.worktable.charpanel.charField.setText("");
                mainwindow.worktable.textpanel.lineTextPane.setText("");
                this.timer.stop();
            }
        }
    }

    public void checkTypedChar(char ch) {

        if (ch == mainwindow.model.lessonLines.
                get(mainwindow.model.actualLine).
                charAt(mainwindow.model.actualIndex)) {
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.white);
            mainwindow.model.actualIndex++;
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.orange);
            mainwindow.model.lessonPointer++;
            mainwindow.worktable.progresspanel.progressBar.
                setValue(mainwindow.model.lessonPointer);
        } else {
            mainwindow.model.setCharColor(mainwindow.model.actualIndex, Color.red);
            badPoint();
        }
    }

    public void badPoint() {
        mainwindow.model.badPoint++;
        mainwindow.worktable.statuspanel.errorField.
        setText("Hiba: " + mainwindow.model.badPoint.toString());
    }

}
