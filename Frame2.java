import javax.swing.*;
import java.awt.*;

public class Frame2
{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame();
        fr.setSize(400,200);
        
        MyPanel2 cow = new MyPanel2(Color.BLUE);
        //JPanel mine = new JPanel();
        // JPanel two = new JPanel();
        // mine.setSize(200,100);
        // two.setSize(200,100);
       // two.setBackground(Color.CYAN);
        // mine.setBackground(new Color(200,12,12));
        
        Container blah = fr.getContentPane();
        
        blah.add(cow);
        // blah.add(mine);
        // blah.add(two);
        
        fr.pack();
        
        fr.setVisible(true);
        
    }
}
