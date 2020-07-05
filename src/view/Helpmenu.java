package view;

import javax.swing.*;
import controller.HelpController;
import controller.Controller;

public class Helpmenu extends JMenu {
    private static final long serialVersionUID = 8343884989394834l;
    HelpController hcon;
    Controller con;
    Mainwindow mainwindow;

    JMenuItem aboutMenuItem = new JMenuItem();
    JMenuItem contentMenuItem = new JMenuItem();
    JMenuItem creditMenuItem = new JMenuItem();

    public Helpmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.hcon  = new HelpController(mainwindow);
        this.con = new Controller(mainwindow);

        this.aboutMenuItem.setText(con.bundle.getString("About"));
        this.contentMenuItem.setText(con.bundle.getString("Content"));
        this.creditMenuItem.setText(con.bundle.getString("Credit"));

        this.aboutMenuItem.addActionListener(
            e -> hcon.about(mainwindow));
        this.contentMenuItem.addActionListener(
            e -> hcon.content(mainwindow));
        this.creditMenuItem.addActionListener(
            e -> hcon.credit(mainwindow));

        this.add(contentMenuItem);
        this.add(creditMenuItem);
        this.add(aboutMenuItem);
        this.setText(con.bundle.getString("Help"));
    }
}
