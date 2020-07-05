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
        System.out.println("Yes");
    }

    public void lesson04() {
        System.out.println("Yes");
    }

    public void lesson05() {
        System.out.println("Yes");
    }

    public void lesson06() {
        System.out.println("Yes");
    }

    public void lesson07() {
        System.out.println("Yes");
    }

    public void lesson08() {
        System.out.println("Yes");
    }

    public void lesson09() {
        System.out.println("Yes");
    }

    public void lesson10() {
        System.out.println("Yes");
    }

    public void lesson11() {
        System.out.println("Yes");
    }

    public void lesson12() {
        System.out.println("Yes");
    }

    public void lesson13() {
        System.out.println("Yes");
    }

    public void lesson14() {
        System.out.println("Yes");
    }


}
