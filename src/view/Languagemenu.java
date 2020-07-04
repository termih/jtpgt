package view;

import javax.swing.*;
import controller.OptionController;

public class Languagemenu extends JMenu {
    private static final long serialVersionUID = 834384928438434l;
    Mainwindow mainwindow;
    OptionController con = new OptionController();

    JMenuItem englishMenuItem = new JMenuItem();
    JMenuItem hungaryMenuItem = new JMenuItem();

    public Languagemenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.englishMenuItem.setText(con.bundle.getString("English"));
        this.hungaryMenuItem.setText(con.bundle.getString("Hungary"));

        this.englishMenuItem.addActionListener(
            e -> con.setBundle("us", mainwindow));
        this.hungaryMenuItem.addActionListener(
            e -> con.setBundle("hu", mainwindow));

        this.setText(con.bundle.getString("Language"));
        this.add(englishMenuItem);
        this.add(hungaryMenuItem);
    }
}
