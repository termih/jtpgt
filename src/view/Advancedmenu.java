package view;

import javax.swing.*;
import controller.AdvancedController;
import controller.Controller;

class Advancedmenu extends JMenu {
    private static final long serialVersionUID = 348384934874l;
    Mainwindow mainwindow;
    Controller con = new Controller();
    AdvancedController bcon = new AdvancedController(mainwindow);

    JMenuItem lesson29MenuItem = new JMenuItem();
    JMenuItem lesson30MenuItem = new JMenuItem();
    JMenuItem lesson31MenuItem = new JMenuItem();
    JMenuItem lesson32MenuItem = new JMenuItem();
    JMenuItem lesson33MenuItem = new JMenuItem();

    public Advancedmenu(Mainwindow mainwindow) {
        con = new Controller();
        lesson29MenuItem.setText(con.bundle.getString("Lesson29"));
        lesson30MenuItem.setText(con.bundle.getString("Lesson30"));
        lesson31MenuItem.setText(con.bundle.getString("Lesson31"));
        lesson32MenuItem.setText(con.bundle.getString("Lesson32"));
        lesson33MenuItem.setText(con.bundle.getString("Lesson33"));

        lesson29MenuItem.addActionListener(e -> bcon.lesson29(e));

        this.setText(con.bundle.getString("Advanced"));
        this.add(lesson29MenuItem);
        this.add(lesson30MenuItem);
        this.add(lesson31MenuItem);
        this.add(lesson32MenuItem);
        this.add(lesson33MenuItem);
    }

}
