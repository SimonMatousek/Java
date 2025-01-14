import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        Color[] color ={Color.red,Color.orange,Color.yellow,Color.green,Color.blue,new Color(102,0,153),new Color(100,0,180)};
        int x = 0;
        graphics.setColor(color[0]);
        graphics.fillRect(0,0,WIDTH / 7,HEIGHT);
        for (int i= 1; i < color.length; i++) {
            graphics.setColor(color[i]);
            graphics.fillRect(x += WIDTH / 7,0,WIDTH / 7,HEIGHT);
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
