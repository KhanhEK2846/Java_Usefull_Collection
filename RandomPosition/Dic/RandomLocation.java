package Dic;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

public class RandomLocation {
    private static int[][] position = new int[1][];
    private final static Dimension sizeScreen = Toolkit.getDefaultToolkit().getScreenSize();
    private static int offset = 5;
    private static Dimension LocalSizeFrame = new Dimension(0, 0);

    public void setOffset(int offset) {
        RandomLocation.offset = offset;
    }

    public int[][] getAllPosition(Dimension sizeFrame) {
        ConvertOutOfBound(sizeFrame);
        return position;
    }

    public int[][] getAllPosition() {
        return position;
    }

    public int[] getIndexPosition(int index, Dimension sizeFrame) throws Exception {
        ConvertOutOfBound(index,sizeFrame);
        return position[index];
    }

    public int[] getIndexPosition(int index) {
        return position[index];
    }

    RandomLocation(){
        position[0] = generateLocation();
    }

    RandomLocation(int TotalFrame) throws Exception {
        if(TotalFrame <= 0)
        {
            throw new Exception("Number of Frame are invalid");
        }

        if(TotalFrame == 1)
        {
            position[0] = generateLocation();
        }else{
            position = new int[TotalFrame][];
            for(int i = 0; i < TotalFrame; i++)
            {
                position[i] = generateLocation();
            }
        }
    }

    private static int[] generateLocation(){
        int[] locate = new int[2];

        Random generator = new Random();;
        locate[0] = Math.abs(generator.nextInt((int)sizeScreen.getWidth()));
        locate[1] = Math.abs(generator.nextInt((int)sizeScreen.getHeight()));
        return locate;
    }

    private static void ConvertOutOfBound(Dimension sizeFrame)
    {
        if(LocalSizeFrame.equals(sizeFrame))
            return;
        for(int index = 0; index<position.length; index++)
        {
            /* Horizontal */
            if(position[index][0] + sizeFrame.getWidth() > sizeScreen.getWidth() - offset)
            {
                position[index][0] = (int)sizeScreen.getWidth() - (int)sizeFrame.getWidth() - offset;
            }
            if(position[index][0] < offset)
            {
                position[index][0] = offset;
            }

            /* Vertical */
            if(position[index][1] + sizeFrame.getHeight() > sizeScreen.getHeight() - offset)
            {
                position[index][1] = (int)sizeScreen.getHeight() - (int)sizeFrame.getHeight() - offset;
            }
            if(position[index][1] < offset)
            {
                position[index][1] = offset;
            }
            LocalSizeFrame.setSize(sizeFrame);
        }
    }

    private static void ConvertOutOfBound(int index, Dimension sizeFrame) throws Exception
    {
        if(index >= position.length)
            throw new Exception("Index out of bounds");

        /* Horizontal */
        if(position[index][0] + sizeFrame.getWidth() > sizeScreen.getWidth() - offset)
        {
            position[index][0] = (int)sizeScreen.getWidth() - (int)sizeFrame.getWidth() - offset;
        }
        if(position[index][0] < offset)
        {
            position[index][0] = offset;
        }

        /* Vertical */
        if(position[index][1] + sizeFrame.getHeight() > sizeScreen.getHeight() - offset)
        {
            position[index][1] = (int)sizeScreen.getHeight() - (int)sizeFrame.getHeight() - offset;
        }
        if(position[index][1] < offset)
        {
            position[index][1] = offset;
        }

    }

}
