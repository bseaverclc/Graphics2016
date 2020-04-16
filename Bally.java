import javax.swing.*;
import java.awt.*;

public class Bally
{
    private int x,y,diameter, speed;
    private Color c;
    
    public Bally(int x, int y, int diameter, int speed, Color c)
    {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speed = speed;
        this.c = c;
    }
    
    public Bally()
    {
        x = (int)(Math.random()*400 + 2);
        y = (int)(Math.random()*400 + 2);
        diameter = (int)(Math.random()*50 + 5);
        speed = (int)(Math.random()*4 + 1);
        c = new Color((int)(Math.random()*256 + 0),(int)(Math.random()*256 + 0),(int)(Math.random()*256 + 0));
    }
    
    public void bounce(MyPanel2 p)
    {
        if(x<=0 || x >= p.getWidth())
        {
            speed *= -1;
        }
    }
    
    public void move()
    {
        x += speed;
    }
    
    public void moveDown()
    {
        y+=3;
    }
    
    public void draw(Graphics blah)
    {
        blah.setColor(c);
        blah.fillOval(x,y,diameter,diameter);
    }
    
    public void setX(int inX)
    {
        x = inX;
    }
    
    public void setY(int inY)
    {
        y = inY;
    }
    
    
}