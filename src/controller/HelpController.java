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

    public void credit(Mainwindow mainwindow) {
        JOptionPane.showMessageDialog(mainwindow,
        "Thanks to Ian Gardner for his English-language curriculum\nfrom his book, \"The milk is white.\"");
    }

    public void content(Mainwindow mainwindow) {

    }
}
