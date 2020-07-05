package controller;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;
import model.AppProperties;
import model.Model;

public class Controller {

    Locale magyar = new Locale("hu", "HU");
    public ResourceBundle bundle;
    AppProperties ap = new AppProperties();
    Properties pro = ap.loadProperties();

    public Controller() {
        String langStr = pro.getProperty("lang");
        System.out.println("Lang: "+langStr);
        if(langStr.equals("hu")) {
            this.bundle = ResourceBundle.getBundle(
                "bundle", magyar);
            System.out.println("magyar");
        }else {
            this.bundle = ResourceBundle.getBundle(
                "bundle", Locale.ROOT);
            System.out.println("angol");
        }
    }

}
