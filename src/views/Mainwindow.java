
import javax.swing.*;
import java.awt.*;


class Mainwindow extends JFrame {
    static final long serialVersionUID = 123254798434l;

    Worktable worktable = new Worktable();
    Menubar menubar = new Menubar();

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
