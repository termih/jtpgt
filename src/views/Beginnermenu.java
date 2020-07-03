import javax.swing.*;

class Beginnermenu extends JMenu {
    private static final long serialVersionUID = 42349745783874l;

    JMenuItem lesson01MenuItem = new JMenuItem();
    JMenuItem lesson02MenuItem = new JMenuItem();
    JMenuItem lesson03MenuItem = new JMenuItem();
    JMenuItem lesson04MenuItem = new JMenuItem();
    JMenuItem lesson05MenuItem = new JMenuItem();

    public Beginnermenu() {
        lesson01MenuItem.setText("Lecke 01 (f, j)");
        lesson02MenuItem.setText("Lecke 02 (f, j)");
        lesson03MenuItem.setText("Lecke 03 (f, j)");
        lesson04MenuItem.setText("Lecke 04 (f, j)");
        lesson05MenuItem.setText("Lecke 05 (f, j)");

        this.setText("Kezdő");
        this.add(lesson01MenuItem);
        this.add(lesson02MenuItem);
        this.add(lesson03MenuItem);
        this.add(lesson04MenuItem);
        this.add(lesson05MenuItem);
    }

}
