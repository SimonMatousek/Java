import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!
        //continue
        int[] x ={100,120,200,10};
        int[] y ={80,29,200,80};
        int[] size ={30,40,50,60};
        Color[] color = {Color.GREEN,Color.BLUE,Color.RED,Color.ORANGE};
        for (int i = 0; i < 4; i++) {
            graphics.setColor(color[i]);
            graphics.drawRect(x[i],y[i],size[i],size[i]);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
