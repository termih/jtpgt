import javax.swing.*;
import java.awt.*;

class Cmdpanel extends JPanel {
    private static final long serialVersionUID = 4243l;
    JScrollPane scrollPane = new JScrollPane();
    JTextPane helperTextPane = new JTextPane();
    public Cmdpanel() {
        helperTextPane.setFont(new java.awt.Font("Dialog", 0, 14));
        helperTextPane.setMinimumSize(new java.awt.Dimension(6, 200));
        helperTextPane.setPreferredSize(new java.awt.Dimension(6, 200));

        scrollPane.setViewportView(helperTextPane);
        this.setLayout(new GridLayout(1, 0));
        this.add(scrollPane);
    }
}
