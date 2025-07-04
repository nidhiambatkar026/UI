import java.awt.*;
import java.awt.event.*;
public class UI2 extends Frame
{
    Label l1;
    UI2()
    {
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent obj)
            {
                System.exit(0);
            }
 
        } ); 
            l1=new Label("This is window closing Example");
            this.add(l1);
            setTitle("Window");
            setSize(300, 400);
            setVisible(true);
    }
public static void main(String args[])
{
    new UI2();
    
}
}