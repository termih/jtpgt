package view;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;
    Mainwindow mainwindow;

    Locale Magyar = new Locale("hu", "HU");
	ResourceBundle bundle = ResourceBundle.getBundle("bundle", Magyar);

    Beginnermenu beginnermenu = new Beginnermenu(mainwindow);

    public Lessonmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.setText(bundle.getString("Lesson"));
        this.add(beginnermenu);
    }

}
