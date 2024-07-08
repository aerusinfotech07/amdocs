package com.admocs.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouncingBall extends JPanel implements ActionListener {

    private int x = 0; // Ball's x coordinate
    private int y = 0; // Ball's y coordinate
    private int xDirection = 2; // Ball's x direction
    private int yDirection = 2; // Ball's y direction
    private final int ballSize = 20; // Ball's size
    private final Timer timer; // Timer to update the position

    public BouncingBall() {
        // Set the timer to call actionPerformed every 10 milliseconds
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, ballSize, ballSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the ball's position
        x += xDirection;
        y += yDirection;

        // Bounce the ball off the edges
        if (x <= 0 || x >= getWidth() - ballSize) {
            xDirection = -xDirection;
        }
        if (y <= 0 || y >= getHeight() - ballSize) {
            yDirection = -yDirection;
        }

        // Repaint the panel
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall ballPanel = new BouncingBall();
        frame.add(ballPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
