import view.Mainwindow;
import java.awt.EventQueue;

public class Tpgt {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                Mainwindow mainwindow = new Mainwindow();
                mainwindow.setVisible(true);
            }
        });

    }
}
