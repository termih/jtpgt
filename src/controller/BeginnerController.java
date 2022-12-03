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

import view.Mainwindow;

public class BeginnerController {

    Mainwindow mainwindow;

    public BeginnerController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public void lesson01() {
        mainwindow.model.loadLesson("lesson01");
    }

    public void lesson02() {
        mainwindow.model.loadLesson("lesson02");
    }

    public void lesson03() {
        mainwindow.model.loadLesson("lesson03");
    }

    public void lesson04() {
        mainwindow.model.loadLesson("lesson04");
    }

    public void lesson05() {
        mainwindow.model.loadLesson("lesson05");
    }

    public void lesson06() {
        mainwindow.model.loadLesson("lesson06");
    }

    public void lesson07() {
        mainwindow.model.loadLesson("lesson07");
    }

    public void lesson08() {
        mainwindow.model.loadLesson("lesson08");
    }

    public void lesson09() {
        mainwindow.model.loadLesson("lesson09");
    }

    public void lesson10() {
        mainwindow.model.loadLesson("lesson10");
    }

    public void lesson11() {
        mainwindow.model.loadLesson("lesson11");
    }

    public void lesson12() {
        mainwindow.model.loadLesson("lesson12");
    }

    public void lesson13() {
        mainwindow.model.loadLesson("lesson13");
    }

    public void lesson14() {
        mainwindow.model.loadLesson("lesson14");
    }

}
