package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import controller.TextpaneController;

public class Textpanel extends JPanel {
    private static final long serialVersionUID = 42l;
    JScrollPane scrollPane = new JScrollPane();
    public JTextPane lineTextPane = new JTextPane();
    Mainwindow mainwindow;
    TextpaneController tcon;
    public Textpanel(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.tcon = new TextpaneController(mainwindow);
        scrollPane.setViewportView(lineTextPane);
        lineTextPane.setEditable(false);
        lineTextPane.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        lineTextPane.addKeyListener(new KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                // lineTextPaneKeyTyped(evt);
                tcon.formKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                // lineTextPaneKeyPressed(evt);
                tcon.lineTextPaneKeyPressed(evt);
            }
        });

        this.setLayout(new GridLayout(1, 0));
        this.add(scrollPane);
    }
}
