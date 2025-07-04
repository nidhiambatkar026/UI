import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UI_03  extends JFrame{

    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b1,b2,b3;
    JFrame f1;

    UI_03(){
        f1 = new JFrame("Flow Layout Example");
        f1.setSize(500,500);
        l1 = new JLabel("Enter Your Name");
        l2 = new JLabel("Enter Your City");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);

        b1 = new JButton("Submit");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");

        f1.setLayout(new FlowLayout());

        f1.add(l1);
        f1.add(tf1);
        f1.add(l2);
        f1.add(tf2);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);

        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new UI_03();
    }
}
