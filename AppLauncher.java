import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AppLauncher {
    public static void main(String[] args){

        JFrame.setDefaultLookAndFeelDecorated(true);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                new AppGui().setVisible(true);
            }
        });
    }
}
