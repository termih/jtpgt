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

class Menubar extends JMenuBar {
    private static final long serialVersionUID = 423483487983l;
    Mainwindow mainwindow;
    public Menubar(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.add(new Lessonmenu(mainwindow));
        this.add(new Optionmenu(mainwindow));
        this.add(new Helpmenu(mainwindow));
    }
}
