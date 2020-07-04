package view;

import javax.swing.*;
import controller.OptionController;

public class Optionmenu extends JMenu {
    private static final long serialVersionUID = 3483984382348l;

    Mainwindow mainwindow;
    OptionController con = new OptionController();
    Languagemenu languagemenu = new Languagemenu(mainwindow);

    public Optionmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.setText(con.bundle.getString("Options"));
        this.add(languagemenu);
    }
}
