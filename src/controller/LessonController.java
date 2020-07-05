package controller;

import view.Mainwindow;

public class LessonController {

    Mainwindow mainwindow;

    public LessonController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
    }
    public void nextLesson() {
        this.mainwindow.model.loadNextLesson();
    }

    public void repeatLesson() {
        System.out.println("Lecke ismétlése");
        this.mainwindow.model.repeatLesson();
    }

    public void previousLesson() {
        System.out.println("Előző lecke");
        this.mainwindow.model.loadPreviousLesson();
    }

    public void exit() {
        System.exit(0);
    }
}
