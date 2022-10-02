import java.awt.*;

class FrameDemo extends Frame
{   
    Label l1;
    FrameDemo()
    {
        this.setVisible(true);
        this.setSize(400,400);
        l1 = new Label("Welcome This Is Frame");
        this.add(l1);
    }

    public static void main(String args[])
    {
        FrameDemo fd = new FrameDemo();
    }
}