package view;

import javax.swing.*;
import controller.Controller;
import controller.LessonController;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;
    Mainwindow mainwindow;

    Controller con;
    LessonController lcon;

    JMenuItem nextLessonMenuItem = new JMenuItem();
    JMenuItem repeatLessonMenuItem = new JMenuItem();
    JMenuItem previousLessonMenuItem = new JMenuItem();
    JMenuItem exitMenuItem = new JMenuItem();

    public Lessonmenu(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.lcon = new LessonController(mainwindow);
        this.con = new Controller(mainwindow);

        this.nextLessonMenuItem.setText(con.bundle.getString("nextLesson"));
        this.repeatLessonMenuItem.setText(con.bundle.getString("repeatLesson"));
        this.previousLessonMenuItem.setText(con.bundle.getString("previousLesson"));
        this.exitMenuItem.setText(con.bundle.getString("exit"));

        this.nextLessonMenuItem.addActionListener(
            e -> lcon.nextLesson()
        );
        this.repeatLessonMenuItem.addActionListener(
            e -> lcon.repeatLesson()
        );
        this.previousLessonMenuItem.addActionListener(
            e -> lcon.previousLesson()
        );
        this.exitMenuItem.addActionListener(
            e -> lcon.exit()
        );

        this.setText(con.bundle.getString("Lesson"));
        this.add(new Beginnermenu(mainwindow));
        this.add(new Middlemenu(mainwindow));
        this.add(new Advancedmenu(mainwindow));
        this.add(nextLessonMenuItem);
        this.add(repeatLessonMenuItem);
        this.add(previousLessonMenuItem);
        this.add(exitMenuItem);
    }

}
