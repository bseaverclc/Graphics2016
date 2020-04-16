import javax.swing.*;
import java.awt.*;
public class FirstFrame2020
{
    //1  Create a JFrame
    //2  Create a JPanel
    //3  Get the contentPane from the JFrame
    //4  Add the panel to the contentPane
    //5  Make the Frame Visible

    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame("Making a Frame");
        myFrame.setLayout(new GridLayout(1,2));
       // myFrame.setSize(300,300);
        
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.RED);
        myPanel.setPreferredSize(new Dimension(50,50));
        
        JPanel myPanel2 = new JPanel();
        myPanel2.setBackground(Color.BLUE);
        myPanel2.setPreferredSize(new Dimension(50,100));
        
        myFrame.add(myPanel);
         myFrame.add(myPanel2);
         
         myFrame.pack();
        myFrame.setVisible(true);
        

    }
}
