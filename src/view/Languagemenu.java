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
import controller.OptionController;
import controller.Controller;

public class Languagemenu extends JMenu {
    private static final long serialVersionUID = 834384928438434l;
    Mainwindow mainwindow;
    OptionController ocon;
    Controller con;

    JMenuItem englishMenuItem = new JMenuItem();
    JMenuItem hungaryMenuItem = new JMenuItem();

    public Languagemenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.ocon = new OptionController(mainwindow);
        this.con = new Controller(mainwindow);

        this.englishMenuItem.setText(con.bundle.getString("English"));
        this.hungaryMenuItem.setText(con.bundle.getString("Hungary"));

        this.englishMenuItem.addActionListener(
            e -> ocon.setBundle("us")
        );
        this.hungaryMenuItem.addActionListener(
            e -> ocon.setBundle("hu")
        );

        this.setText(con.bundle.getString("Language"));
        this.add(englishMenuItem);
        this.add(hungaryMenuItem);
    }
}
