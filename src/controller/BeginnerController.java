package controller;

import java.awt.event.*;
import view.Mainwindow;
import model.Model;

public class BeginnerController {

    Mainwindow mainwindow;
    Model model;

    public BeginnerController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.model = new Model(mainwindow);
    }

    public void lesson01() {
        model.loadLesson("lesson01");
    }

    public void lesson02() {
        model.loadLesson("lesson02");
    }

    public void lesson03() {
        model.loadLesson("lesson03");
    }

    public void lesson04() {
        model.loadLesson("lesson04");
    }

    public void lesson05() {
        model.loadLesson("lesson05");
    }

    public void lesson06() {
        model.loadLesson("lesson06");
    }

    public void lesson07() {
        model.loadLesson("lesson07");
    }

    public void lesson08() {
        model.loadLesson("lesson08");
    }

    public void lesson09() {
        model.loadLesson("lesson09");
    }

    public void lesson10() {
        model.loadLesson("lesson10");
    }

    public void lesson11() {
        model.loadLesson("lesson11");
    }

    public void lesson12() {
        model.loadLesson("lesson12");
    }

    public void lesson13() {
        model.loadLesson("lesson13");
    }

    public void lesson14() {
        model.loadLesson("lesson14");
    }


}
