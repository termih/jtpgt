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
import controller.MiddleController;

class Middlemenu extends JMenu {
    private static final long serialVersionUID = 383489343434l;
    Mainwindow mainwindow;
    MiddleController mcon;

    JMenuItem lesson15MenuItem = new JMenuItem();
    JMenuItem lesson16MenuItem = new JMenuItem();
    JMenuItem lesson17MenuItem = new JMenuItem();
    JMenuItem lesson18MenuItem = new JMenuItem();
    JMenuItem lesson19MenuItem = new JMenuItem();
    JMenuItem lesson20MenuItem = new JMenuItem();
    JMenuItem lesson21MenuItem = new JMenuItem();
    JMenuItem lesson22MenuItem = new JMenuItem();
    JMenuItem lesson23MenuItem = new JMenuItem();
    JMenuItem lesson24MenuItem = new JMenuItem();
    JMenuItem lesson25MenuItem = new JMenuItem();
    JMenuItem lesson26MenuItem = new JMenuItem();
    JMenuItem lesson27MenuItem = new JMenuItem();
    JMenuItem lesson28MenuItem = new JMenuItem();

    public Middlemenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.mcon = new MiddleController(mainwindow);

        lesson15MenuItem.setText(mainwindow.con.bundle.getString("Lesson15"));
        lesson16MenuItem.setText(mainwindow.con.bundle.getString("Lesson16"));
        lesson17MenuItem.setText(mainwindow.con.bundle.getString("Lesson17"));
        lesson18MenuItem.setText(mainwindow.con.bundle.getString("Lesson18"));
        lesson19MenuItem.setText(mainwindow.con.bundle.getString("Lesson19"));
        lesson20MenuItem.setText(mainwindow.con.bundle.getString("Lesson20"));
        lesson21MenuItem.setText(mainwindow.con.bundle.getString("Lesson21"));
        lesson22MenuItem.setText(mainwindow.con.bundle.getString("Lesson22"));
        lesson23MenuItem.setText(mainwindow.con.bundle.getString("Lesson23"));
        lesson24MenuItem.setText(mainwindow.con.bundle.getString("Lesson24"));
        lesson25MenuItem.setText(mainwindow.con.bundle.getString("Lesson25"));
        lesson26MenuItem.setText(mainwindow.con.bundle.getString("Lesson26"));
        lesson27MenuItem.setText(mainwindow.con.bundle.getString("Lesson27"));
        lesson28MenuItem.setText(mainwindow.con.bundle.getString("Lesson28"));

        lesson15MenuItem.addActionListener(e -> mcon.lesson15());
        lesson16MenuItem.addActionListener(e -> mcon.lesson16());
        lesson17MenuItem.addActionListener(e -> mcon.lesson17());
        lesson18MenuItem.addActionListener(e -> mcon.lesson18());
        lesson19MenuItem.addActionListener(e -> mcon.lesson19());
        lesson20MenuItem.addActionListener(e -> mcon.lesson20());
        lesson21MenuItem.addActionListener(e -> mcon.lesson21());
        lesson22MenuItem.addActionListener(e -> mcon.lesson22());
        lesson23MenuItem.addActionListener(e -> mcon.lesson23());
        lesson24MenuItem.addActionListener(e -> mcon.lesson24());
        lesson25MenuItem.addActionListener(e -> mcon.lesson25());
        lesson26MenuItem.addActionListener(e -> mcon.lesson26());
        lesson27MenuItem.addActionListener(e -> mcon.lesson27());
        lesson28MenuItem.addActionListener(e -> mcon.lesson28());

        this.setText(mainwindow.con.bundle.getString("Middle"));
        this.add(lesson15MenuItem);
        this.add(lesson16MenuItem);
        this.add(lesson17MenuItem);
        this.add(lesson18MenuItem);
        this.add(lesson19MenuItem);
        this.add(lesson20MenuItem);
        this.add(lesson21MenuItem);
        this.add(lesson22MenuItem);
        this.add(lesson23MenuItem);
        this.add(lesson24MenuItem);
        this.add(lesson25MenuItem);
        this.add(lesson26MenuItem);
        this.add(lesson27MenuItem);
        this.add(lesson28MenuItem);
    }

}
