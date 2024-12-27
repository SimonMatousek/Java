import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center
        int[] x ={0,WIDTH,WIDTH,0};
        int[] y ={0,0,HEIGHT,HEIGHT};

        for (int i = 0; i < WIDTH / 20; i++) {
            //top
             x[0] += 20;
            drawLine(x[0],y[0],graphics);
            //right Side
            y[1] += 20;
            drawLine(x[1],y[1],graphics);
            //bottom
            x[2] -= 20;
            drawLine(x[2],y[2],graphics);
            //left side
            y[3] -= 20;
            drawLine(x[3],y[3],graphics);
        }


    }
    public static void drawLine(int x,int y,Graphics graphics) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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