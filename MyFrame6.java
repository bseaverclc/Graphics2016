import java.awt.*;
import javax.swing.*;
public class MyFrame6
{
    public static void main(String[] args)
    {
        JFrame hot = new JFrame();
        hot.setSize(400,300);
        
        MyPanel6 cold = new MyPanel6();
        
        Container frigid = hot.getContentPane();
        
        frigid.add(cold);
        
        hot.setVisible(true);
    }
}
   