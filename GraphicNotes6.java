import javax.swing.*;
import java.awt.*;

public class GraphicNotes6
{
    public static void main(String[] args)
    {
        JFrame pony = new JFrame("My first Gui");// built the frame
        pony.setSize(200,200);
        
        JPanel cat = new JPanel();
        Color mine = new Color(100,200,7);
        cat.setBackground(Color.BLUE);
        
        Container dog = pony.getContentPane();
        
        dog.add(cat);
        
        pony.setVisible(true);
        
        

    }
}
