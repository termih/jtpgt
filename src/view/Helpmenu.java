package view;

import javax.swing.*;
import controller.HelpController;

public class Helpmenu extends JMenu {
    private static final long serialVersionUID = 8343884989394834l;
    HelpController con = new HelpController();
    Mainwindow mainwindow;

    JMenuItem aboutMenuItem = new JMenuItem();
    JMenuItem contentMenuItem = new JMenuItem();

    public Helpmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;

        this.aboutMenuItem.setText(con.bundle.getString("About"));
        this.contentMenuItem.setText(con.bundle.getString("Content"));

        this.aboutMenuItem.addActionListener(
            e -> con.about(mainwindow));
        this.contentMenuItem.addActionListener(
            e -> con.content(mainwindow));

        this.add(contentMenuItem);
        this.add(aboutMenuItem);
        this.setText(con.bundle.getString("Help"));
    }
}
