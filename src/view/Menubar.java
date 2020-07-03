package view;

import javax.swing.*;

class Menubar extends JMenuBar {
    private static final long serialVersionUID = 423483487983l;
    Mainwindow mainwindow;
    public Menubar(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.add(new Lessonmenu(mainwindow));
    }
}
