package DSA;
import javax.swing.*;
//import javax.swing.text.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyWindow {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
       // ActionListener

        //create button and jframe
        JButton button=new JButton("Click me!!");
        button.addActionListener(e->{
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null, "Hey I got it");
        });
            
        frame.add( button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
