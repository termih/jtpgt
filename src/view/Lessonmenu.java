package view;

import javax.swing.*;
import controller.Controller;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;
    Mainwindow mainwindow;

    Controller con = new Controller();
    Beginnermenu beginnermenu = new Beginnermenu(mainwindow);

    public Lessonmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.setText(con.bundle.getString("Lesson"));
        this.add(beginnermenu);
    }

}
