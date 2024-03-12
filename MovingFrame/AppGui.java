import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class AppGui extends JFrame{
    AppGui(){
        super("Moving Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);
        setResizable(false);
        while (true) {
            Location location = new Location();
            setLocation(location.getX(), location.getY());
            setVisible(true);
            // try{
            //     TimeUnit.SECONDS.sleep(1);
            // }catch(InterruptedException e){
            //     e.printStackTrace();
            // }
            
        }
    }
}
