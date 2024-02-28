import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LauncherPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton myButton = new JButton("Close Window");
    private final int sizeF = 420;

    LauncherPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener((ActionListener) this);
        myButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(sizeF,sizeF);
        frame.setLayout(null);

        
        
        frame.setLocation(new Location().getX(),new Location().getY());
        
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myButton){
            frame.dispose();
            new LauncherPage();
        }
    }
}
