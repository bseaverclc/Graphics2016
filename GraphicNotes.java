import javax.swing.*; // package for graphics
import java.awt.*;
public class GraphicNotes
{
    public static void main(String[] args)
    {
        JFrame pony = new JFrame("My first GUI");
        
        pony.setSize(200,300);
        
        JPanel dog = new JPanel();
        
       // dog.setLayout(new BorderLayout());
       //dog.setLayout(null);
        dog.setLayout(new GridLayout(2,2));
        ImageIcon icon = new ImageIcon("aceSpades.png");
        icon.setImage(icon.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
        JLabel pic = new JLabel(icon);
        JButton button = new JButton("Hello");
        JLabel label = new JLabel("Goodbye");
        
        //label.setBounds(20,100,100,30);
        //dog.add(button);
        dog.add(label);
        dog.add(button);
        dog.add(pic);
        dog.setBackground(new Color(200,50,7));
        
       Container cat = pony.getContentPane();
       
        
        cat.add(dog);
        
        pony.setVisible(true);
    }
}