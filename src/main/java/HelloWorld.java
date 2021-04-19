import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class HelloWorld extends JFrame{
    private JLabel lblMensagem;
    private JPanel panel1;

    public HelloWorld(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
}

    public static void main(String[] args) {
        new HelloWorld("Hello World").setVisible(true);
    }
}

