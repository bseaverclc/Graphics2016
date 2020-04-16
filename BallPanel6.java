import java.awt.*;
import javax.swing.*;
import java.awt.event.*;//

public class BallPanel6 extends JPanel
{
    Ball6 school = new Ball6(20,30,10,1,Color.RED);
    Ball6 police = new Ball6(100,46,20,2,Color.CYAN);
    public BallPanel6()
    {
        setBackground(Color.BLACK);
        addMouseListener(new MyMouseListener());
        addKeyListener(new MyKeyListener());
        setFocusable(true);
        requestFocus();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        school.draw(g);
        school.move();
        school.bounce(this);
        
        police.draw(g);
        
       
        
        

        try
        {
            Thread.sleep(100);
        }
        catch(Exception winter)
        {
        }
        

        repaint();

    }
    
    public class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            int blah = e.getKeyCode();
            //System.out.println(blah);
            if(blah == KeyEvent.VK_RIGHT)
            {
                police.setX(police.getX()+1);
            }
        }
    }
    
    public class MyMouseListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            int hi = e.getX();
           int bye = e.getY();
           police.setX(hi);
            
        }
        
    }
}