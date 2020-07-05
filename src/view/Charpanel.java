package view;

import javax.swing.*;
import java.awt.*;

public class Charpanel extends JPanel {
    private static final long serialVersionUID = 4234534343l;
    public JTextField charField = new JTextField();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    public Charpanel() {
        this.charField.setFont(new Font("Dialog", 0, 24));
        this.charField.setHorizontalAlignment(JTextField.CENTER);
        this.charField.setMinimumSize(new Dimension(50, 50));
        this.charField.setPreferredSize(new Dimension(50, 50));

        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new GridBagLayout());

        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        this.add(charField, gridBagConstraints);
    }
}
