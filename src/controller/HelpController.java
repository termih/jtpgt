package controller;

import javax.swing.*;
import view.Mainwindow;

public class HelpController {
    final String aboutStr = "jTpgt\nVersion: 0.1\nLicense: GNU GPL v2";

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
