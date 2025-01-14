import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares

        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        int starX;
        int starY;
        int color;
        for (int i = 0; i < 20; i++) {
            starX = (int) (Math.random() * WIDTH - 10);
            starY = (int) (Math.random() * HEIGHT - 10);
            color = (int) (Math.random() * 100);
            graphics.setColor( new Color (color,color,color));
            graphics.fillRect(starX,starY,10,10);
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
