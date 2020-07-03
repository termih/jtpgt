import javax.swing.*;
import java.awt.*;

class Statuspanel extends JPanel {
    private static final long serialVersionUID = 4298l;
    JTextField rowCountField = new JTextField();
    JTextField actualRowField = new JTextField();
    JTextField errorField = new JTextField();
    JTextField speedField = new JTextField();
    JTextField maxSpeedField = new JTextField();

    public Statuspanel() {
        this.setLayout(new GridLayout(1, 0));
        this.add(rowCountField);
        this.add(actualRowField);
        this.add(errorField);
        this.add(speedField);
        this.add(maxSpeedField);
    }
}
