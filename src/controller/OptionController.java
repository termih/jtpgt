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

import java.util.*;
import view.Mainwindow;
import javax.swing.JOptionPane;
import model.AppProperties;

public class OptionController {

    Mainwindow mainwindow;
    AppProperties app;

    public OptionController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.app = new AppProperties(mainwindow);
    }

    public void setBundle(String locale) {
        Properties pro = new Properties();

        if(locale.equals("hu")) {
            pro.setProperty("lang", "hu");
        }else {
            pro.setProperty("lang", "us");
        }
        app.writeProperties(pro);
        JOptionPane.showMessageDialog(mainwindow,
            mainwindow.con.bundle.getString(
            "ProgramRestart"
            ));
    }

}
