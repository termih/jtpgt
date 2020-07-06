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
import controller.BeginnerController;
import controller.Controller;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349734344383874l;
    Mainwindow mainwindow;
    Controller con;
    BeginnerController bcon;

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();
    JMenuItem lesson06MenuItem = new JMenuItem();
    JMenuItem lesson07MenuItem = new JMenuItem();
    JMenuItem lesson08MenuItem = new JMenuItem();
    JMenuItem lesson09MenuItem = new JMenuItem();
    JMenuItem lesson10MenuItem = new JMenuItem();
    JMenuItem lesson11MenuItem = new JMenuItem();
    JMenuItem lesson12MenuItem = new JMenuItem();
    JMenuItem lesson13MenuItem = new JMenuItem();
    JMenuItem lesson14MenuItem = new JMenuItem();

    public Beginnermenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.bcon = new BeginnerController(mainwindow);
        this.con = new Controller(mainwindow);

        lesson01MenuItem.setText(con.bundle.getString("Lesson01"));
        lesson02MenuItem.setText(con.bundle.getString("Lesson02"));
        lesson03MenuItem.setText(con.bundle.getString("Lesson03"));
        lesson04MenuItem.setText(con.bundle.getString("Lesson04"));
        lesson05MenuItem.setText(con.bundle.getString("Lesson05"));
        lesson06MenuItem.setText(con.bundle.getString("Lesson06"));
        lesson07MenuItem.setText(con.bundle.getString("Lesson07"));
        lesson08MenuItem.setText(con.bundle.getString("Lesson08"));
        lesson09MenuItem.setText(con.bundle.getString("Lesson09"));
        lesson10MenuItem.setText(con.bundle.getString("Lesson10"));
        lesson11MenuItem.setText(con.bundle.getString("Lesson11"));
        lesson12MenuItem.setText(con.bundle.getString("Lesson12"));
        lesson13MenuItem.setText(con.bundle.getString("Lesson13"));
        lesson14MenuItem.setText(con.bundle.getString("Lesson14"));

        lesson01MenuItem.addActionListener(e -> bcon.lesson01());
        lesson02MenuItem.addActionListener(e -> bcon.lesson02());
        lesson03MenuItem.addActionListener(e -> bcon.lesson03());
        lesson04MenuItem.addActionListener(e -> bcon.lesson04());
        lesson05MenuItem.addActionListener(e -> bcon.lesson05());
        lesson06MenuItem.addActionListener(e -> bcon.lesson06());
        lesson07MenuItem.addActionListener(e -> bcon.lesson07());
        lesson08MenuItem.addActionListener(e -> bcon.lesson08());
        lesson09MenuItem.addActionListener(e -> bcon.lesson09());
        lesson10MenuItem.addActionListener(e -> bcon.lesson10());
        lesson11MenuItem.addActionListener(e -> bcon.lesson11());
        lesson12MenuItem.addActionListener(e -> bcon.lesson12());
        lesson13MenuItem.addActionListener(e -> bcon.lesson13());
        lesson14MenuItem.addActionListener(e -> bcon.lesson14());

        this.setText(con.bundle.getString("Beginner"));
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
        this.add(lesson06MenuItem);
        this.add(lesson07MenuItem);
        this.add(lesson08MenuItem);
        this.add(lesson09MenuItem);
        this.add(lesson10MenuItem);
        this.add(lesson11MenuItem);
        this.add(lesson12MenuItem);
        this.add(lesson13MenuItem);
        this.add(lesson14MenuItem);
    }

}
