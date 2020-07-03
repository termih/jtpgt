import javax.swing.*;
import java.awt.*;

class Progresspanel extends JPanel {
    private static final long serialVersionUID = 4274l;
    JProgressBar progressBar = new JProgressBar();
    public Progresspanel() {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setLayout(new GridLayout(1, 0));
        this.add(progressBar);
    }
}
