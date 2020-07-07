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

package model;

import java.io.*;
import java.util.Properties;
import javax.swing.JOptionPane;
import view.Mainwindow;

public class AppProperties {
    private String propertiesFileName= "Tpgt.properties";
    Mainwindow mainwindow;
    public AppProperties(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public Properties loadProperties() {
        Properties pro = new Properties();
        try {
            pro = tryLoadProperties();
        }catch(IOException e) {
            System.err.println("Hiba! A beállításfájl betöltése sikertelen!");
        }
        return pro;
    }

    public Properties tryLoadProperties() throws IOException {
        checkPropertiesFile();
        FileInputStream fis = new FileInputStream(propertiesFileName);
        Properties pro = new Properties();
        pro.load(fis);
        return pro;
    }

    public void writeProperties(Properties pro) {
        try {
            tryWriteProperties(pro);
        }catch(IOException e) {
            System.err.println("Hiba! A beállítások kiíratása sikeretelen!");
        }
    }

    private void tryWriteProperties(Properties pro) throws IOException {
        FileOutputStream fos = new FileOutputStream(propertiesFileName);
        pro.store(fos, null);
    }

    private void checkPropertiesFile() {
        File propertiesFile = new File(this.propertiesFileName);
        if(!propertiesFile.exists()) {
            JOptionPane.showMessageDialog(mainwindow, "Error! " +
                this.propertiesFileName + " file not found!");
            System.exit(1);            
        }

    }

}
