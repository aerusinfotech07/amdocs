package com.admocs.thread;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleBouncingBalls extends JPanel {
    private final List<Ball> balls = new ArrayList<>();
    private final int ballSize = 20; // Ball size
    private final int numberOfBalls = 10; // Number of balls

    public MultipleBouncingBalls() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
    }

    public void initializeBalls() {
        // Create and start threads for multiple balls
        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = new Ball();
            balls.add(ball);
            Thread thread = new Thread(ball);
            thread.start();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            ball.draw(g);
        }
    }

    private class Ball implements Runnable {
        private int x, y, xDirection, yDirection;
        private final Color color;

        public Ball() {
            Random rand = new Random();
            x = rand.nextInt(getWidth() - ballSize);
            y = rand.nextInt(getHeight() - ballSize);
            xDirection = rand.nextBoolean() ? 2 : -2;
            yDirection = rand.nextBoolean() ? 2 : -2;
            color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }

        @Override
        public void run() {
            while (true) {
                move();
                repaint();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void move() {
            x += xDirection;
            y += yDirection;

            if (x <= 0 || x >= getWidth() - ballSize) {
                xDirection = -xDirection;
            }
            if (y <= 0 || y >= getHeight() - ballSize) {
                yDirection = -yDirection;
            }
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, ballSize, ballSize);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Bouncing Balls");
        MultipleBouncingBalls panel = new MultipleBouncingBalls();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Initialize balls after the frame is visible
        SwingUtilities.invokeLater(panel::initializeBalls);
    }
}
