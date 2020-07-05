package controller;

import java.util.*;
import java.util.ResourceBundle.Control;
import view.Mainwindow;
import java.io.*;
import javax.swing.JOptionPane;
import model.AppProperties;

public class OptionController {

    Mainwindow mainwindow;
    AppProperties ap = new AppProperties();

    public OptionController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }

    public void setBundle(String locale) {
        Properties pro = new Properties();

        if(locale.equals("hu")) {
            pro.setProperty("lang", "hu");
        }else {
            pro.setProperty("lang", "us");
        }
        ap.writeProperties(pro);
        JOptionPane.showMessageDialog(mainwindow,
            "Elmentve. A program újraindítása szükséges");
    }

}
