import javax.swing.*;
import java.awt.*;

public class ThePanel extends JPanel
{
    private int x = 10;

    public ThePanel(Color w)
    {
    setBackground(w);
    setPreferredSize(new Dimension(200,400));
    }

   public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
       g.fillOval(x,30,10,10);

        x++;

        try{
            Thread.sleep(100);
        }
        catch(Exception e){System.out.println("Caught");}

        repaint();
    }

}