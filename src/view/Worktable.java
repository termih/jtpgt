package view;

import javax.swing.*;

public class Worktable extends JPanel {
    private static final long serialVersionUID = 429343438l;
    Mainwindow mainwindow;
    public Textpanel textpanel = new Textpanel();
    public Charpanel charpanel = new Charpanel();
    public Cmdpanel cmdpanel = new Cmdpanel();
    public Progresspanel progresspanel = new Progresspanel();
    public Statuspanel statuspanel = new Statuspanel();

    public Worktable(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(textpanel);
        this.add(charpanel);
        this.add(cmdpanel);
        this.add(progresspanel);
        this.add(statuspanel);
    }
}
