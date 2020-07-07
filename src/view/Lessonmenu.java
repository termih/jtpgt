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

package view;

import javax.swing.*;
import controller.LessonController;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;
    Mainwindow mainwindow;

    LessonController lcon;

    JMenuItem nextLessonMenuItem = new JMenuItem();
    JMenuItem repeatLessonMenuItem = new JMenuItem();
    JMenuItem previousLessonMenuItem = new JMenuItem();
    JMenuItem exitMenuItem = new JMenuItem();

    public Lessonmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.lcon = new LessonController(mainwindow);

        this.nextLessonMenuItem.setText(
            mainwindow.con.bundle.getString("nextLesson"));
        this.repeatLessonMenuItem.setText(
            mainwindow.con.bundle.getString("repeatLesson"));
        this.previousLessonMenuItem.setText(
            mainwindow.con.bundle.getString("previousLesson"));
        this.exitMenuItem.setText(
            mainwindow.con.bundle.getString("exit"));

        this.nextLessonMenuItem.addActionListener(
            e -> lcon.nextLesson()
        );
        this.repeatLessonMenuItem.addActionListener(
            e -> lcon.repeatLesson()
        );
        this.previousLessonMenuItem.addActionListener(
            e -> lcon.previousLesson()
        );
        this.exitMenuItem.addActionListener(
            e -> lcon.exit()
        );

        this.setText(mainwindow.con.bundle.getString("Lesson"));
        this.add(new Beginnermenu(mainwindow));
        this.add(new Middlemenu(mainwindow));
        this.add(new Advancedmenu(mainwindow));
        this.add(nextLessonMenuItem);
        this.add(repeatLessonMenuItem);
        this.add(previousLessonMenuItem);
        this.add(exitMenuItem);
    }

}
