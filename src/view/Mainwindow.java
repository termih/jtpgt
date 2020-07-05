package view;
import javax.swing.*;
import java.awt.*;
import model.Model;


public class Mainwindow extends JFrame {
    static final long serialVersionUID = 123254798434l;

    public Worktable worktable = new Worktable(this);
    Menubar menubar;
    public Model model;

    public JTextPane lineTextPane = worktable.textpanel.lineTextPane;

    public Mainwindow() {
        this.model = new Model(this);
        this.menubar = new Menubar(this);
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
