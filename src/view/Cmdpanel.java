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

public class Cmdpanel extends JPanel {
    private static final long serialVersionUID = 4243l;
    JScrollPane scrollPane = new JScrollPane();
    public JTextPane helperTextPane = new JTextPane();
    public Cmdpanel() {
        helperTextPane.setFont(new java.awt.Font("Dialog", 0, 14));
        helperTextPane.setMinimumSize(new java.awt.Dimension(6, 200));
        helperTextPane.setPreferredSize(new java.awt.Dimension(6, 200));
        helperTextPane.setEditable(false);
        scrollPane.setViewportView(helperTextPane);
        this.setLayout(new GridLayout(1, 0));
        this.add(scrollPane);
    }
}
