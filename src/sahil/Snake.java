//Copyright belongs to Sahil Kumar
package sahil;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame 
{
    public Snake() 
    {    
        initUI();
    }    
    private void initUI() 
    {       
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("The Classic Snake -- Sahil Kumar (21MCA2881)");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    public static void main(String[] args) 
    {       
        EventQueue.invokeLater(() -> 
        {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}