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

public class Charpanel extends JPanel {
    private static final long serialVersionUID = 4234534343l;
    private JPanel charFieldPanel = new JPanel();
    public JTextField charField = new JTextField();
    public JLabel lessonLabel = new JLabel();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    public Charpanel() {
        this.charField.setFont(new Font("Dialog", 0, 24));
        this.charField.setHorizontalAlignment(JTextField.CENTER);
        this.charField.setMinimumSize(new Dimension(50, 50));
        this.charField.setPreferredSize(new Dimension(50, 50));

        this.charFieldPanel.add(charField);
        this.lessonLabel.setFont(new Font("Dialog", 0, 14));
        this.lessonLabel.setHorizontalAlignment(SwingConstants.CENTER);

        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new GridLayout(2, 1));

        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.gridx = 1;
        this.add(charFieldPanel, gridBagConstraints);
        this.add(lessonLabel, gridBagConstraints);
    }
}
