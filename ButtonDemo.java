import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener
{   
    Button b1,b2,b3;

    ButtonDemo()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        b1 = new Button("Red");
        b2 = new Button("Green");
        b3 = new Button("Blue");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        this.add(b1);
        this.add(b2);
        this.add(b3);

    }

    public void actionPerformed(ActionEvent ae)
    {   String s = ae.getActionCommand();

        if(s.equals("Red"))
        {
            this.setBackground(Color.red);
        }
        if(s.equals("Green"))
        {
            this.setBackground(Color.green);
        }
        if(s.equals("Blue"))
        {
            this.setBackground(Color.blue);
        }   
    }
    
    public static void main(String args[])
    {
        ButtonDemo BL = new ButtonDemo();
    }
}