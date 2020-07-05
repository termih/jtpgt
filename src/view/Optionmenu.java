package view;

import javax.swing.*;
import controller.OptionController;
import controller.Controller;

public class Optionmenu extends JMenu {
    private static final long serialVersionUID = 3483984382348l;

    Mainwindow mainwindow;
    OptionController ocon;
    Controller con;
    Languagemenu languagemenu;

    public Optionmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.languagemenu = new Languagemenu(mainwindow);
        this.ocon = new OptionController(mainwindow);
        this.con = new Controller(mainwindow);
        this.setText(con.bundle.getString("Options"));
        this.add(languagemenu);
    }
}
