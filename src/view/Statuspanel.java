package view;

import javax.swing.*;
import java.awt.*;

public class Statuspanel extends JPanel {
    private static final long serialVersionUID = 4298l;
    public JTextField rowCountField = new JTextField();
    public JTextField actualRowField = new JTextField();
    public JTextField errorField = new JTextField();
    public JTextField speedField = new JTextField();
    public JTextField maxSpeedField = new JTextField();

    public Statuspanel() {
        this.setLayout(new GridLayout(1, 0));
        this.add(rowCountField);
        this.add(actualRowField);
        this.add(errorField);
        this.add(speedField);
        this.add(maxSpeedField);
    }
}
