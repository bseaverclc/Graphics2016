import javax.swing.*;
import java.awt.*;

public class MyPanel6 extends JPanel
{
    ImageIcon fork = new ImageIcon("aceSpades.png");
    JLabel card2 = new JLabel();
    
    
    
        
    public void paintComponent(Graphics cow)
    {
        cow.drawRect(4, _y_, _width_, _height_)
        super.paintComponent(cow);
        fork.paintIcon(this,cow,0,0);
        card2.setIcon(new ImageIcon("aceSpades.png"));
        add(card2);
        cow.drawOval(40,100,10,10);
    }
    
    
}
   