package controller;

import javax.swing.*;
import view.Mainwindow;

public class HelpController extends Controller {
    final String aboutStr = "jTpgt\nVersion: 0.1\nLicense: GNU GPL v2";
    public void about(Mainwindow mainwindow) {
        JOptionPane.showMessageDialog(mainwindow, aboutStr);
    }

    public void content(Mainwindow mainwindow) {
        JOptionPane.showMessageDialog(mainwindow, "Shadow method");
    }
}
