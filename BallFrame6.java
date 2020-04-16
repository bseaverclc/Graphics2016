import java.awt.*;
import javax.swing.*;

public class BallFrame6
{
    public static void main(String[] args)
    {
        JFrame fall = new JFrame();
        fall.setSize(400,500);
        
        BallPanel6 summer = new BallPanel6();
        
        Container spring = fall.getContentPane();
        
        spring.add(summer);
        
        fall.setVisible(true);
        
    }
}