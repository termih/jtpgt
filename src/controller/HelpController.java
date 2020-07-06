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

import javax.swing.*;
import view.Mainwindow;
import view.AboutDialog;
import view.HelpDialog;

public class HelpController {

    Mainwindow mainwindow;

    public HelpController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public void about(Mainwindow mainwindow) {
        new AboutDialog(mainwindow).setVisible(true);
    }

    public void content(Mainwindow mainwindow) {
        // JOptionPane.showMessageDialog(mainwindow,
        // "Shadow method");
        new HelpDialog(mainwindow).setVisible(true);
    }
}
