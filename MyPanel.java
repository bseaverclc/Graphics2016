
import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
public class MyPanel extends JPanel
{
    
    //public ImageIcon spoon = new ImageIcon("pony.jpg");
    
    public void paintComponent(Graphics cow)
    {
        super.paintComponent(cow);
        cow.setColor(Color.red);
        cow.fillOval(20,100,10,10);
        setBackground(Color.GREEN);
        cow.setColor(Color.BLUE);
        cow.drawString("Hello World", 100, 50);
        
        //spoon.paintIcon(this, cow, 0,0);
        
    }
   
}
