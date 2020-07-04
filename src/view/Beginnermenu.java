package view;

import javax.swing.*;
import controller.BeginnerController;
import controller.Controller;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349734344383874l;
    Mainwindow mainwindow;
    Controller con = new Controller();
    BeginnerController bcon = new BeginnerController(mainwindow);

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();
    JMenuItem lesson06MenuItem = new JMenuItem();
    JMenuItem lesson07MenuItem = new JMenuItem();
    JMenuItem lesson08MenuItem = new JMenuItem();
    JMenuItem lesson09MenuItem = new JMenuItem();
    JMenuItem lesson10MenuItem = new JMenuItem();
    JMenuItem lesson11MenuItem = new JMenuItem();
    JMenuItem lesson12MenuItem = new JMenuItem();
    JMenuItem lesson13MenuItem = new JMenuItem();
    JMenuItem lesson14MenuItem = new JMenuItem();

    public Beginnermenu(Mainwindow mainwindow) {
        con = new Controller();
        lesson01MenuItem.setText(con.bundle.getString("Lesson01"));
        lesson02MenuItem.setText(con.bundle.getString("Lesson02"));
        lesson03MenuItem.setText(con.bundle.getString("Lesson03"));
        lesson04MenuItem.setText(con.bundle.getString("Lesson04"));
        lesson05MenuItem.setText(con.bundle.getString("Lesson05"));
        lesson06MenuItem.setText(con.bundle.getString("Lesson06"));
        lesson07MenuItem.setText(con.bundle.getString("Lesson07"));
        lesson08MenuItem.setText(con.bundle.getString("Lesson08"));
        lesson09MenuItem.setText(con.bundle.getString("Lesson09"));
        lesson10MenuItem.setText(con.bundle.getString("Lesson10"));
        lesson11MenuItem.setText(con.bundle.getString("Lesson11"));
        lesson12MenuItem.setText(con.bundle.getString("Lesson12"));
        lesson13MenuItem.setText(con.bundle.getString("Lesson13"));
        lesson14MenuItem.setText(con.bundle.getString("Lesson14"));

        lesson01MenuItem.addActionListener(e -> bcon.lesson01(e));
        lesson02MenuItem.addActionListener(e -> bcon.lesson02(e));
        lesson03MenuItem.addActionListener(e -> bcon.lesson03(e));
        lesson04MenuItem.addActionListener(e -> bcon.lesson04(e));
        lesson05MenuItem.addActionListener(e -> bcon.lesson05(e));
        lesson06MenuItem.addActionListener(e -> bcon.lesson06(e));
        lesson07MenuItem.addActionListener(e -> bcon.lesson07(e));
        lesson08MenuItem.addActionListener(e -> bcon.lesson08(e));
        lesson09MenuItem.addActionListener(e -> bcon.lesson09(e));
        lesson10MenuItem.addActionListener(e -> bcon.lesson10(e));
        lesson11MenuItem.addActionListener(e -> bcon.lesson11(e));
        lesson12MenuItem.addActionListener(e -> bcon.lesson12(e));
        lesson13MenuItem.addActionListener(e -> bcon.lesson13(e));
        lesson14MenuItem.addActionListener(e -> bcon.lesson14(e));

        this.setText(con.bundle.getString("Beginner"));
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
        this.add(lesson06MenuItem);
        this.add(lesson07MenuItem);
        this.add(lesson08MenuItem);
        this.add(lesson09MenuItem);
        this.add(lesson10MenuItem);
        this.add(lesson11MenuItem);
        this.add(lesson12MenuItem);
        this.add(lesson13MenuItem);
        this.add(lesson14MenuItem);
    }

}
