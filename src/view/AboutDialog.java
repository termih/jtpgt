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

public class AboutDialog extends JFrame {
    private static final long serialVersionUID = 83438849384l;

    Mainwindow mainwindow;

    JTabbedPane tabbedPane;
    JPanel aboutPanel;
    JPanel creditPanel;
    JPanel licencPanel;

    public AboutDialog(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;

        this.setTitle("Tpgt");
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        createAboutPanel();
        createCreditPanel();
        createLicencPanel();
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("About", aboutPanel);
        tabbedPane.addTab("Credit", creditPanel);
        tabbedPane.addTab("Licenc", licencPanel);
        this.add(tabbedPane);
    }

    private void createAboutPanel() {
        JLabel nameLabel = new JLabel("Tpgt");
        JLabel versionLabel = new JLabel("Version 0.8.0");
        JLabel authorLabel = new JLabel("Author: Andras Sallai");
        JLabel copyLabel = new JLabel("Copyright (c) 2016, 2019, 2020 Sallai Andras");
        JLabel websiteLabel = new JLabel("http://szit.hu");
        ImageIcon image = new ImageIcon("images/tpgt.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setSize(100, 50);
        Box box = Box.createVerticalBox();
        box.add(Box.createGlue());
        box.add(imageLabel);
        box.add(Box.createGlue());
        box.add(nameLabel);
        box.add(versionLabel);
        box.add(authorLabel);
        box.add(copyLabel);
        box.add(websiteLabel);
        box.add(Box.createGlue());
        aboutPanel = new JPanel();
        aboutPanel.add(box, "Center");
    }

    private void createCreditPanel() {
        String text = "Thanks to Ian Gardner for his English-language curriculum\nfrom his book, \"The milk is white.\"";
        creditPanel = new JPanel();
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        textArea.append(text);
        creditPanel.setLayout(new BorderLayout());
        creditPanel.add(scrollPane);
    }

    private void createLicencPanel() {
        licencPanel = new JPanel();
        JTextArea textArea = readFile();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        licencPanel.setLayout(new BorderLayout());
        licencPanel.add(scrollPane);
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
        JTextArea textArea = new JTextArea();
        FileReader reader = new FileReader("license.txt");
        textArea.read(reader, "license.txt");
        return textArea;
    }

}
