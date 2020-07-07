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
import model.Model;
import controller.Controller;

public class Mainwindow extends JFrame {
    static final long serialVersionUID = 123254798434l;

    public Worktable worktable = new Worktable(this);
    Menubar menubar;
    public Model model;
    public Controller con;
    public JTextPane lineTextPane = worktable.textpanel.lineTextPane;

    public Mainwindow() {
        this.model = new Model(this);
        this.con = new Controller(this);
        this.menubar = new Menubar(this);

        this.setIconImage(new ImageIcon("images/gtpgt.png").getImage());
        this.setLayout( new BorderLayout() );
        this.add(worktable);
        this.setMinimumSize(new Dimension(840, 500));
        this.setTitle("Tpgt");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(menubar);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
