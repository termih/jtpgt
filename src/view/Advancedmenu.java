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
import controller.AdvancedController;
import controller.Controller;

class Advancedmenu extends JMenu {
    private static final long serialVersionUID = 348384934874l;
    Mainwindow mainwindow;
    Controller con;
    AdvancedController acon;

    JMenuItem lesson29MenuItem = new JMenuItem();
    JMenuItem lesson30MenuItem = new JMenuItem();
    JMenuItem lesson31MenuItem = new JMenuItem();
    JMenuItem lesson32MenuItem = new JMenuItem();
    JMenuItem lesson33MenuItem = new JMenuItem();
    JMenuItem lesson34MenuItem = new JMenuItem();
    JMenuItem lesson35MenuItem = new JMenuItem();
    JMenuItem lesson36MenuItem = new JMenuItem();
    JMenuItem lesson37MenuItem = new JMenuItem();
    JMenuItem lesson38MenuItem = new JMenuItem();
    JMenuItem lesson39MenuItem = new JMenuItem();
    JMenuItem lesson40MenuItem = new JMenuItem();
    JMenuItem lesson41MenuItem = new JMenuItem();
    JMenuItem lesson42MenuItem = new JMenuItem();

    public Advancedmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        acon =  new AdvancedController(mainwindow);
        con = new Controller(mainwindow);

        lesson29MenuItem.setText(con.bundle.getString("Lesson29"));
        lesson30MenuItem.setText(con.bundle.getString("Lesson30"));
        lesson31MenuItem.setText(con.bundle.getString("Lesson31"));
        lesson32MenuItem.setText(con.bundle.getString("Lesson32"));
        lesson33MenuItem.setText(con.bundle.getString("Lesson33"));
        lesson34MenuItem.setText(con.bundle.getString("Lesson34"));
        lesson35MenuItem.setText(con.bundle.getString("Lesson35"));
        lesson36MenuItem.setText(con.bundle.getString("Lesson36"));
        lesson37MenuItem.setText(con.bundle.getString("Lesson37"));
        lesson38MenuItem.setText(con.bundle.getString("Lesson38"));
        lesson39MenuItem.setText(con.bundle.getString("Lesson39"));
        lesson40MenuItem.setText(con.bundle.getString("Lesson40"));
        lesson41MenuItem.setText(con.bundle.getString("Lesson41"));
        lesson42MenuItem.setText(con.bundle.getString("Lesson42"));

        lesson29MenuItem.addActionListener(e -> acon.lesson29());
        lesson30MenuItem.addActionListener(e -> acon.lesson30());
        lesson31MenuItem.addActionListener(e -> acon.lesson31());
        lesson32MenuItem.addActionListener(e -> acon.lesson32());
        lesson33MenuItem.addActionListener(e -> acon.lesson33());
        lesson34MenuItem.addActionListener(e -> acon.lesson34());
        lesson35MenuItem.addActionListener(e -> acon.lesson35());
        lesson36MenuItem.addActionListener(e -> acon.lesson36());
        lesson37MenuItem.addActionListener(e -> acon.lesson37());
        lesson38MenuItem.addActionListener(e -> acon.lesson38());
        lesson39MenuItem.addActionListener(e -> acon.lesson39());
        lesson40MenuItem.addActionListener(e -> acon.lesson40());
        lesson41MenuItem.addActionListener(e -> acon.lesson41());
        lesson42MenuItem.addActionListener(e -> acon.lesson42());

        this.setText(con.bundle.getString("Advanced"));
        this.add(lesson29MenuItem);
        this.add(lesson30MenuItem);
        this.add(lesson31MenuItem);
        this.add(lesson32MenuItem);
        this.add(lesson33MenuItem);
        this.add(lesson34MenuItem);
        this.add(lesson35MenuItem);
        this.add(lesson36MenuItem);
        this.add(lesson37MenuItem);
        this.add(lesson38MenuItem);
        this.add(lesson39MenuItem);
        this.add(lesson40MenuItem);
        this.add(lesson41MenuItem);
        this.add(lesson42MenuItem);
    }

}
