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
import java.awt.*;
import java.io.*;

public class HelpDialog extends JFrame {
    private static final long serialVersionUID = 424389348234l;

    Mainwindow mainwindow;
    JPanel helpPanel;

    public HelpDialog(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;

        this.setTitle(mainwindow.model.programName);
        this.setIconImage(new ImageIcon("images/gtpgt.png").getImage());
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        createHelpPanel();
        this.add(helpPanel);
    }

    private void createHelpPanel() {
        helpPanel = new JPanel();
        JTextArea textArea = readFile();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        helpPanel.setLayout(new BorderLayout());
        helpPanel.add(scrollPane);
    }

    private JTextArea readFile() {
        JTextArea textArea = new JTextArea();
        try {
            textArea = tryReadFile();
        }catch(FileNotFoundException e) {
            System.err.println("Error! File not found!");
        }catch(IOException e) {
            System.err.println("Error! Input Output error!");
        }
        return textArea;
    }

    private JTextArea tryReadFile()
        throws FileNotFoundException, IOException {
        String helpFileName = "";
        if(mainwindow.model.lessonsLanguage.equals("Hungarian")) {
            helpFileName = "help_hu.txt";
        }else {
            helpFileName = "help.txt";
        }

        JTextArea textArea = new JTextArea();
        FileReader reader = new FileReader(helpFileName);
        textArea.read(reader, "licen.txt");
        return textArea;
    }

}
