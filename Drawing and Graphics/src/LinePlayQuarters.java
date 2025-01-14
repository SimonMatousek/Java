import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawImage(Graphics graphics){
        graphics.drawLine(HEIGHT/2,0,HEIGHT/2,WIDTH);
        graphics.drawLine(0,WIDTH/2,HEIGHT,WIDTH/2);
        for (int i = 0; i < 9; i++) {
            graphics.setColor(Color.GREEN);
            //Top left
            graphics.drawLine(i * 20,HEIGHT/2,10,i * 20);
            //Top right
            graphics.drawLine(WIDTH/2 + i * 20,HEIGHT/2,WIDTH/2 + 10, i * 20);
            //Bottom left
            graphics.drawLine(i * 20,HEIGHT,10,HEIGHT/2 + i * 20);
            //Bottom right
            graphics.drawLine(WIDTH/2 + i * 20,HEIGHT,WIDTH/2 + 10,HEIGHT/2 + i * 20);
            graphics.setColor(Color.PINK);
            //Top left
            graphics.drawLine(WIDTH/2 - i * 20,0,WIDTH/2 - 10,HEIGHT/2 - i * 20);
            //Top right
            graphics.drawLine(WIDTH - i * 20,0,WIDTH - 10, HEIGHT/2 - i * 20);
            //Bottom left
            graphics.drawLine(WIDTH/2 - i * 20,HEIGHT/2,WIDTH/2 - 10,HEIGHT - i * 20);
            //Bottom right
            graphics.drawLine(WIDTH - i * 20,HEIGHT / 2,WIDTH - 10,HEIGHT - i * 20);


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
