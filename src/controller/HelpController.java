package controller;

import javax.swing.*;
import view.Mainwindow;

public class HelpController {

    Mainwindow mainwindow;

    public HelpController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public void about(Mainwindow mainwindow) {
        mainwindow.model.aboutBoxShow();
    }

    public void content(Mainwindow mainwindow) {
        JOptionPane.showMessageDialog(mainwindow, "Shadow method");
    }
}
