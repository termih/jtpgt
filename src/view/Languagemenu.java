package view;

import javax.swing.*;
import controller.OptionController;
import controller.Controller;

public class Languagemenu extends JMenu {
    private static final long serialVersionUID = 834384928438434l;
    Mainwindow mainwindow;
    OptionController ocon;
    Controller con;

    JMenuItem englishMenuItem = new JMenuItem();
    JMenuItem hungaryMenuItem = new JMenuItem();

    public Languagemenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.ocon = new OptionController(mainwindow);
        this.con = new Controller(mainwindow);

        this.englishMenuItem.setText(con.bundle.getString("English"));
        this.hungaryMenuItem.setText(con.bundle.getString("Hungary"));

        this.englishMenuItem.addActionListener(
            e -> ocon.setBundle("us")
        );
        this.hungaryMenuItem.addActionListener(
            e -> ocon.setBundle("hu")
        );

        this.setText(con.bundle.getString("Language"));
        this.add(englishMenuItem);
        this.add(hungaryMenuItem);
    }
}
