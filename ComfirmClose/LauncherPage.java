import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LauncherPage {

    JFrame frame = new JFrame();
    private final int sizeF = 420;
    
    LauncherPage(){
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(sizeF,sizeF);
        frame.setLayout(null);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                new ComfirmClose(frame);
            }
        });
        
        frame.setVisible(true);
    }
}
