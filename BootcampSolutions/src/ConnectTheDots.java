import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        Integer[] xAndy1 ={10, 10, 10, 290, 10, 290, 290, 290};
        Integer[] xAndy2 ={50,100,70,70,80,90,90,90,100,70,120,100,85,130,50,100};
        connectPoints1(graphics,xAndy1);
        connectPoints2(graphics,xAndy2);
    }
    public static void connectPoints1(Graphics graphics,Integer[] xAndy1) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < xAndy1.length - 4; i++) {
            graphics.drawLine(xAndy1[i], xAndy1[i + 1],xAndy1[i + 2],xAndy1[i + 3]);
        }
        graphics.drawLine(xAndy1[4],xAndy1[5],xAndy1[6],xAndy1[7]);
    }
    public static void connectPoints2(Graphics graphics,Integer[] xAndy2) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < xAndy2.length - 4; i++) {
            graphics.drawLine(xAndy2[i],xAndy2[i + 1], xAndy2[i + 2],xAndy2[i + 3]);
        }
        graphics.drawLine(xAndy2[12],xAndy2[13],xAndy2[14],xAndy2[15]);
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
