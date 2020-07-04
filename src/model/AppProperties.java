package model;

import java.io.*;
import java.util.Properties;

public class AppProperties {

    public Properties loadProperties() {
        Properties pro = new Properties();
        try {
            pro = tryLoadProperties();
        }catch(IOException e) {
            System.err.println("Hiba! A beállításfájl betöltése sikertelen!");
        }
        return pro;
    }

    public Properties tryLoadProperties() throws IOException {
        FileInputStream fis = new FileInputStream("Tpgt.properties");
        Properties pro = new Properties();
        pro.load(fis);
        return pro;
    }

    public void writeProperties(Properties pro) {
        try {
            tryWriteProperties(pro);
        }catch(IOException e) {
            System.err.println("Hiba! A beállítások kiíratása sikeretelen!");
        }
    }

    private void tryWriteProperties(Properties pro) throws IOException {
        FileOutputStream fos = new FileOutputStream("Tpgt.properties");
        pro.store(fos, null);
    }

}
