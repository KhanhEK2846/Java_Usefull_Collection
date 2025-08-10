import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JFrame;


public class AppGui extends JFrame{

    private static final int WIDTH = 150;
    private static final int HEIGHT = 150;

    public AppGui(){
        super("Visible Theme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        MoveLayout();
    }

    private void MoveLayout() {
        // Implement the layout movement logic here
        while (true) {
            Point CursorPosition = MouseInfo.getPointerInfo().getLocation();
            setLocation(CursorPosition.x - WIDTH/2, CursorPosition.y - HEIGHT/2);
            setVisible(true);
        }
    }

}
