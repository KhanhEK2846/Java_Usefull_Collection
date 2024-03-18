import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class AppGui extends JFrame {
    AppGui(){
        super("Custom Cursor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);
        setLayout(null);
        CustomCursor();
    }

    private void CustomCursor() {
       Toolkit toolkit = Toolkit.getDefaultToolkit();
       Image img = toolkit.getImage("cursor.png");
       Point point = new Point(0,0);
       Cursor cusCursor = toolkit.createCustomCursor(img, point, "Cursor");
       setCursor(cusCursor);
    }
}
