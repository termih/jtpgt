package view;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;
import controller.BeginnerController;
import controller.Controller;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349745783874l;
    Mainwindow mainwindow;
    // Controller con = new Controller();
    Controller con;
    BeginnerController bcon = new BeginnerController(mainwindow);

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();

    public Beginnermenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        con = new Controller();
        lesson01MenuItem.setText(con.bundle.getString("Lesson01"));
        lesson02MenuItem.setText(con.bundle.getString("Lesson02"));
        lesson03MenuItem.setText(con.bundle.getString("Lesson03"));
        lesson04MenuItem.setText(con.bundle.getString("Lesson04"));
        lesson05MenuItem.setText(con.bundle.getString("Lesson05"));

        lesson01MenuItem.addActionListener(e -> bcon.lesson01(e));

        this.setText(con.bundle.getString("Beginner"));
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
    }

}
