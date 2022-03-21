import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) throws Exception {
        Gui gui = new Gui();

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Pencil McCalculator");

        window.add(gui);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
