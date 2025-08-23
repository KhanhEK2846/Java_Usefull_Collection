package Dic;

import java.awt.Dimension;

import javax.swing.JFrame;

public class AppGui{

    public AppGui() {
        JFrame[] frames = new JFrame[6];
        Dimension frameSize = new Dimension(600,500);
        RandomLocation randomLocation;
        try {
            randomLocation = new RandomLocation(frames.length);
            for (int i = 0; i < frames.length; i++) {
                frames[i] = new JFrame("Frame " + (i + 1));
                frames[i].setSize(frameSize);
                frames[i].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frames[i].setLocationRelativeTo(null);
                frames[i].setLocation(randomLocation.getAllPosition(frameSize)[i][0], randomLocation.getAllPosition(frameSize)[i][1]);
                frames[i].setVisible(true);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
