package view;

import javax.swing.*;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;
    Mainwindow mainwindow;
    Beginnermenu beginnermenu = new Beginnermenu(mainwindow);
    public Lessonmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.setText("Lecke");
        this.add(beginnermenu);
    }

}
