import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
public class Fidget {
    public static void main(String[] args) {
        JButton but = new JButton("Button");
        JFrame win = new JFrame("Fidget Window");
        JCheckBox box = new JCheckBox("Check box");
        JLabel sign = new JLabel("Fidget Window, a program to fidget around with buttons when you are bored, Made by Dahsinx.");
        JFormattedTextField field = new JFormattedTextField("Text field");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(620,100);
        win.add(but);
        win.add(box);
        win.add(field);
        win.add(sign);
        win.setVisible(true);
        but.setSize(200, 50);
        box.setBounds(276, 20, 125, 20);
        field.setBounds(400,0,800,600);
        field.setSize(200,50);
        sign.setBounds(0, 10, 620, 100);
    }
}
