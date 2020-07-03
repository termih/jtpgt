import javax.swing.*;

class Lessonmenu extends JMenu {
    private static final long serialVersionUID = 48394393493493l;

    Beginnermenu beginnermenu = new Beginnermenu();
    public Lessonmenu() {

        this.setText("Lecke");
        this.add(beginnermenu);
    }

}
