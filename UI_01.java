import java.awt.*;

class normal extends Frame{

    normal(){
        Button b1 = new Button("Click me");
        b1.setBounds(30,100,80,40);
        add(b1);
        setSize(300,400);
        setLayout(null);
        setVisible(true);
    }    
}
public class UI_01{

    public static void main(String[] args) {
        new normal();
    }
}