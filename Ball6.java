import java.awt.*;

public class Ball6
{
    private int x,y,size, speed;
    private Color c;
    
    public Ball6(int inX, int inY, int inSize, int inSpeed, Color inC)
    {
        x=inX;
        y=inY;
        size = inSize;
        speed = inSpeed;
        c = inC;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getX()
    {
        return x;
    }
    
     public void setY(int horse)
    {
        y=horse;
    }
    public void setX(int horse)
    {
        x=horse;
    }
    public void bounce(BallPanel6 thing)
    {
        if(x == thing.getWidth())
        {
            speed = speed*-1;
        }
    }
    
    public void move()
    {
        x=x + speed;
    }
    
    public void draw(Graphics pony)
    {
        pony.setColor(c);
        pony.fillOval(x,y,size,size);
        
    }
}