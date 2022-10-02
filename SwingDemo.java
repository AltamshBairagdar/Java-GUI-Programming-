import java.awt.*;
import javax.swing.*;

class SwingDemo extends JFrame
{   
    Label l1;
    SwingDemo()
    {
        this.setVisible(true);
        this.setSize(400,400);
        l1 = new Label("Welcome This Is Swing");
        this.add(l1);
    }

    public static void main(String args[])
    {
        SwingDemo sd = new SwingDemo();
    }
}