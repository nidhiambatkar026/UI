import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UI_04 extends JFrame implements ActionListener{
    JFrame jf;
    JPanel jp;
    CardLayout cl;

    UI_04(){
           jf= new JFrame("CardLayout Example");
           cl = new CardLayout();
           //Create a main parent panel that will contain two child panel
           jp = new JPanel();//main panel

           //creating Two child panels
           JPanel cp1 = new JPanel();
           JPanel cp2 = new JPanel();

           //Main Buttons
           JButton b1 = new JButton("Numbers");
           JButton b2 = new JButton("Alphabets");

           //Parent Buttons
           JButton b3 = new JButton("1");
           JButton b4 = new JButton("2");
           JButton b5 = new JButton("3");

           //Adding b3,b4,b5 buttons to cp1
           cp1.add(b3);
           cp1.add(b4);
           cp1.add(b5);

           //Parent Buttons
           JButton b6 = new JButton("A");
           JButton b7 = new JButton("B");
           JButton b8 = new JButton("C");
           JButton b9 = new JButton("D");

           //Adding b3,b4,b5 buttons to cp2
           cp2.add(b6);
           cp2.add(b7);
           cp2.add(b8);
           cp2.add(b9);
           
           jp.setLayout(new CardLayout());

           jp.add(cp1,"Numbers");
           jp.add(cp2,"Alphabets");

           b1.addActionListener(this);
           b2.addActionListener(this);

           jf.setLayout(new FlowLayout());

           jf.add(b1);
           jf.add(b2);

           jf.add(jp);
           jf.setSize(500,500);
           jf.setVisible(true); 
      }

      public void actionPerformed(ActionEvent obj){
        if(obj.getActionCommand()== "Numbers"){
           cl.show(jp, "Numbers");
        }else{
           cl.show(jp, "Alphabets");
        }
      }

    public static void main(String[] args) {
        new UI_04();
    }
}
