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
import java.awt.event.KeyAdapter;
import controller.TextpaneController;

public class Textpanel extends JPanel {
    private static final long serialVersionUID = 42l;
    JScrollPane scrollPane = new JScrollPane();
    public JTextPane lineTextPane = new JTextPane();
    Mainwindow mainwindow;
    public TextpaneController tcon;
    public Textpanel(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.tcon = new TextpaneController(mainwindow);
        scrollPane.setViewportView(lineTextPane);
        lineTextPane.setEditable(false);
        lineTextPane.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        lineTextPane.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcon.formKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcon.lineTextPaneKeyPressed(evt);
            }
        });

        this.setLayout(new GridLayout(1, 0));
        this.add(scrollPane);
    }
}
