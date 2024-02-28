import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

public class Location {
    private static int x = 0;
    public final int getX() {
        return x;
    }

    private static int y = 0;
    public final int getY() {
        return y;
    }

    private final int sizeF = 420;

    Location(){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); 
        Random generator = new Random();
    
        x = Math.abs(generator.nextInt((int)size.getWidth()) - sizeF);
        y = Math.abs(generator.nextInt((int)size.getHeight()) - sizeF);
    }

}
