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
import controller.HelpController;

public class Helpmenu extends JMenu {
    private static final long serialVersionUID = 8343884989394834l;
    HelpController hcon;
    Mainwindow mainwindow;

    JMenuItem aboutMenuItem = new JMenuItem();
    JMenuItem contentMenuItem = new JMenuItem();

    public Helpmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.hcon  = new HelpController(mainwindow);

        this.aboutMenuItem.setText(mainwindow.con.bundle.getString("About"));
        this.contentMenuItem.setText(mainwindow.con.bundle.getString("Content"));

        this.aboutMenuItem.addActionListener(
            e -> hcon.about(mainwindow));
        this.contentMenuItem.addActionListener(
            e -> hcon.content(mainwindow));

        this.add(contentMenuItem);
        this.add(aboutMenuItem);
        this.setText(mainwindow.con.bundle.getString("Help"));
    }
}
