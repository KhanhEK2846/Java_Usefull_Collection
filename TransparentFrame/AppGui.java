import java.awt.Color;
import javax.swing.JFrame;

public class AppGui extends JFrame{
    
    public AppGui(){
        super("Visible Theme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(true);
        setBackground(new Color(255,255,255,0));
    }
    
}
