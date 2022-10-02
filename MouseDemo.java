import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "MouseDemo" height = 500 width = 500></applet>*/

public class MouseDemo extends Applet implements MouseListener
{
    public void init()
    {
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent me)
    {
        System.out.println("Mouse Exited");
    }
    public void mouseEntered(MouseEvent me)
    {
        System.out.println("Mouse Entered");
    }
    public void mouseReleased(MouseEvent me)
    {
        System.out.println("Mouse Released");
    }
    public void mousePressed(MouseEvent me)
    {
        System.out.println("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("Mouse Clicked");
    }
}