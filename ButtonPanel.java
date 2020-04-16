import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//

public class ButtonPanel extends JPanel
{
    JButton butt = new JButton("Hi");
    JLabel sign = new JLabel("0");
    int count = 0;
    
   public ButtonPanel()
   {
       butt.addActionListener(new Hi());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        add(butt);
        

    }
    
    public class Hi extends AbstractAction
    {
        public void actionPerformed(ActionEvent e)
        {
           count++;
           sign.setText("" + count);
            //System.out.println(blah);
        }
    }
    
}