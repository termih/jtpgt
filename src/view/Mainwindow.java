package view;
import javax.swing.*;
import java.awt.*;


public class Mainwindow extends JFrame {
    static final long serialVersionUID = 123254798434l;

    Worktable worktable = new Worktable(this);
    Menubar menubar = new Menubar(this);

    public Mainwindow() {
        this.setLayout( new BorderLayout() );
        this.add(worktable);
        this.setMinimumSize(new java.awt.Dimension(800, 500));
        this.setTitle("jTpgt");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(menubar);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
