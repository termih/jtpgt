package view;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;
import controller.BeginnerController;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349745783874l;
    Mainwindow mainwindow;
    BeginnerController con = new BeginnerController(mainwindow);

    Locale magyar = new Locale("hu", "HU");
	ResourceBundle bundle = ResourceBundle.getBundle("bundle", magyar);
	// ResourceBundle bundle = ResourceBundle.getBundle("bundle", Locale.US);

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();

    public Beginnermenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        lesson01MenuItem.setText(bundle.getString("Lesson01"));
        lesson02MenuItem.setText(bundle.getString("Lesson02"));
        lesson03MenuItem.setText(bundle.getString("Lesson03"));
        lesson04MenuItem.setText(bundle.getString("Lesson04"));
        lesson05MenuItem.setText(bundle.getString("Lesson05"));

        lesson01MenuItem.addActionListener(e -> con.lesson01(e));

        this.setText(bundle.getString("Beginner"));
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
    }

}
