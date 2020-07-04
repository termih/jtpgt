package view;

import javax.swing.*;
import controller.MiddleController;
import controller.Controller;

class Middlemenu extends JMenu {
    private static final long serialVersionUID = 383489343434l;
    Mainwindow mainwindow;
    Controller con = new Controller();
    MiddleController bcon = new MiddleController(mainwindow);

    JMenuItem lesson15MenuItem = new JMenuItem();
    JMenuItem lesson16MenuItem = new JMenuItem();
    JMenuItem lesson17MenuItem = new JMenuItem();
    JMenuItem lesson18MenuItem = new JMenuItem();
    JMenuItem lesson19MenuItem = new JMenuItem();

    public Middlemenu(Mainwindow mainwindow) {
        con = new Controller();
        lesson15MenuItem.setText(con.bundle.getString("Lesson15"));
        lesson16MenuItem.setText(con.bundle.getString("Lesson16"));
        lesson17MenuItem.setText(con.bundle.getString("Lesson17"));
        lesson18MenuItem.setText(con.bundle.getString("Lesson18"));
        lesson19MenuItem.setText(con.bundle.getString("Lesson19"));

        lesson15MenuItem.addActionListener(e -> bcon.lesson15(e));

        this.setText(con.bundle.getString("Middle"));
        this.add(lesson15MenuItem);
        this.add(lesson16MenuItem);
        this.add(lesson17MenuItem);
        this.add(lesson18MenuItem);
        this.add(lesson19MenuItem);
    }

}
