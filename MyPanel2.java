import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;  // need this for listeners

public class MyPanel2 extends JPanel
{
    private JButton button;
    private int x = 10;
    private Bally b;
    private ArrayList<Bally> balls = new ArrayList<Bally>();
    public MyPanel2(Color w)
    {
        setBackground(w);
        b = new Bally(10,30,5,4,Color.CYAN);
        for(int i = 0; i < 10; i++)
        {
            balls.add(new Bally());
        }

        button = new JButton("Add Ball");
        button.addActionListener(new MyFirstClass());

        isFocusable();
        //setFocusable(true);
        addKeyListener(new MyKeyListener());

        addMouseListener(new MyMouseListener());

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setFocusable(true);
        //g.setColor(Color.RED);
        // g.fillOval(x,30,10,10);
        //add(button);
        b.draw(g);
        for(Bally bruh: balls)
        {
            bruh.draw(g);
            bruh.move();
            bruh.bounce(this);
        }

        try{
            Thread.sleep(100);
        }
        catch(Exception e){System.out.println("Caught");}

        repaint();
    }

    public class MyFirstClass implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            balls.add(new Bally());
        }
    }

    public class MyKeyListener extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {
            //System.out.println(e.getKeyCode());
            if(e.getKeyCode() == 83)
            {
                b.moveDown();
            }
        }
    }

    public class MyMouseListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            System.out.println(e.getX() + "," +  e.getY());
            b.setX(e.getX());// setting the x value of a ball to the x value of the click
            b.setY(e.getY());
            //System.out.println("clicked");
        }
    }

}
