import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//

public class BallPanel extends JPanel
{
    private int x = 20;
    private int y = 30;
    Ball mine = new Ball(20,0,10,1,Color.red);
    Ball yours = new Ball(50,50,20,1,Color.CYAN);
    JButton butt = new JButton("Hi");
    
    
    public BallPanel(Color x)
    {
        setBackground(x);
        //addMouseListener(new MyMouseListener());
        setPreferredSize(new Dimension(500,500));
        addKeyListener(new MyKeyListener());
        setFocusable(true);
        requestFocus();
        setLayout(new BorderLayout());
     
        butt.addActionListener(new Hi());
        
        
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        yours.draw(g);
        
        mine.draw(g);
        mine.move();
        mine.bounce(this);
        add(butt,BorderLayout.SOUTH);
         butt.setSize(50,50);

            
            
            try
            {
               Thread.sleep(100);
            }
            catch(Exception frog)
            {
            }
            repaint();
        

    }
    
      public class Hi extends AbstractAction
    {
        public void actionPerformed(ActionEvent e)
        {
           // count++;
           // sign.setText("" + count);
            System.out.println("blah");
        }
    }
    
    public class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            int blah = e.getKeyCode();
            if(blah == 39)
            {
               yours.setX(yours.getX() +1);
            }
            if (blah == 37)
            {
                yours.setX(yours.getX()-1);
            }
            //System.out.println(blah);
        }
    }
    
    public class MyMouseListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            int newX = e.getX();
            int newY = e.getY();
            yours.setX(newX);
            
            
            
        }
    }
}