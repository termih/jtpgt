package view;

import javax.swing.*;
import java.awt.*;

public class Progresspanel extends JPanel {
    private static final long serialVersionUID = 4274l;
    public JProgressBar progressBar = new JProgressBar();
    public Progresspanel() {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new GridLayout(1, 0));
        this.add(progressBar);
    }
}
