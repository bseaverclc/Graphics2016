import java.awt.*;
import javax.swing.*;

public class MyFrame
{
    public static void main(String[] args)
    {
        JFrame hi = new JFrame();
        hi.setSize(400,300);
        
        MyPanel bye = new MyPanel();
        
        Container go = hi.getContentPane();
        
        go.add(bye);
        
        hi.setVisible(true);
    }
}
   