package view;

import javax.swing.*;

class Worktable extends JPanel {
    private static final long serialVersionUID = 429343438l;
    Mainwindow mainwindow;
    Textpanel textpanel = new Textpanel();
    Charpanel charpanel = new Charpanel();
    Cmdpanel cmdpanel = new Cmdpanel();
    Progresspanel progresspanel = new Progresspanel();
    Statuspanel statuspanel = new Statuspanel();

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
