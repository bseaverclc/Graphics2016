import java.awt.*;
import javax.swing.*;
public class BallFrame
{
    public static void main(String[] args)
    {
        JFrame hi = new JFrame();
        hi.setSize(400,400);
        
        BallPanel bird = new BallPanel(Color.BLACK);
      // ButtonPanel cow = new ButtonPanel();
        //bird.setSize(400,400);
        
        Container owl = hi.getContentPane();
        //owl.setLayout(new GridLayout(2,1));
        
        owl.add(bird);
        //owl.add(cow);
        
        hi.setVisible(true);
        
    }
}
   