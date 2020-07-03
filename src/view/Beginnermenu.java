package view;

import javax.swing.*;
import controller.BeginnerController;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349745783874l;
    Mainwindow mainwindow;
    BeginnerController con = new BeginnerController(mainwindow);

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();

    public Beginnermenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        lesson01MenuItem.setText("Lecke 01 (f, j)");
        lesson02MenuItem.setText("Lecke 02 (d, k)");
        lesson03MenuItem.setText("Lecke 03 (s, l)");
        lesson04MenuItem.setText("Lecke 04 (a, :)");
        lesson05MenuItem.setText("Lecke 05 (g, h)");

        lesson01MenuItem.addActionListener(e -> con.lesson01(e));

        this.setText("Kezdő");
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
    }

}
