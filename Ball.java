import java.awt.*;

public class Ball
{
    private int x, y, size, speed;
    private Color c;
    
    public Ball(int inX, int inY, int inSize, int inSpeed, Color inC)
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
    
    
     public void setY(int inY)
    {
        y= inY;
    }
    public void setX(int inX)
    {
        x= inX;
    }
    
    public void bounce(BallPanel dog)
    {   
        if(x+size==dog.getWidth())
        {
            speed*=-1;
        }
    }
    
    public void move()
    {
        x+=speed;
        //y+=speed;
    }
    
    public void draw(Graphics pony)
    {
        pony.setColor(c);
        pony.fillOval(x,y,size,size);
    }
    
    
}