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

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;
import model.AppProperties;
import view.Mainwindow;

public class Controller {

    Locale magyar = new Locale("hu", "HU");
    public ResourceBundle bundle;
    AppProperties app;
    Properties pro;
    Mainwindow mainwindow;

    public Controller(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.app = new AppProperties(mainwindow);
        this.pro = app.loadProperties();
        String langStr = pro.getProperty("lang");
        if(langStr.equals("hu")) {
            this.bundle = ResourceBundle.getBundle(
                "bundle", magyar);
            mainwindow.model.setLessonsLanguage("Hungarian");
        }else {
            this.bundle = ResourceBundle.getBundle(
                "bundle", Locale.ROOT);
            mainwindow.model.setLessonsLanguage("English");
        }
    }

}
