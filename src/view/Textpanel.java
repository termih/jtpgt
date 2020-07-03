package view;

import javax.swing.*;
import java.awt.*;

class Textpanel extends JPanel {
    private static final long serialVersionUID = 42l;
    JScrollPane scrollPane = new JScrollPane();
    JTextPane lineTextPane = new JTextPane();
    public Textpanel() {
        scrollPane.setViewportView(lineTextPane);
        lineTextPane.setEditable(false);
        lineTextPane.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        lineTextPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                // lineTextPaneKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                // lineTextPaneKeyPressed(evt);
            }
        });

        this.setLayout(new GridLayout(1, 0));
        this.add(scrollPane);
    }
}
