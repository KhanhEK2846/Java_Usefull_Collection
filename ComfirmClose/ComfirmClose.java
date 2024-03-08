import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComfirmClose {

    ComfirmClose(JFrame frame){
        int choice = JOptionPane.showConfirmDialog(frame, "Do you want to close the application?", "Close Application", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            frame.dispose();
        }
    }
}
