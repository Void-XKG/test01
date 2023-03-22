package com.xkg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake extends JPanel implements KeyListener, Runnable {

    private static final long serialVersionUID = 1L;

    private int width = 1000;
    private int height = 850;
    private Thread thread;
    private boolean running = false;

    private int s = 10;
    private int length = 5;
    private int[] x = new int[100];
    private int[] y = new int[100];

    private int food_x;
    private int food_y;

    private int direction = KeyEvent.VK_RIGHT;

    public Snake() {
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addKeyListener(this);
        frame.add(this);

        startNewGame();
    }

    private void startNewGame() {
        length = 5;
        for(int i = 0; i < length; i++) {
            x[i] = (length - i) * s;
            y[i] = 100;
        }
        generateFood();
    }

    private void generateFood() {
        food_x = (int)(Math.random() * (width - s) / s) * s;
        food_y = (int)(Math.random() * (height - s) / s) * s;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.RED);
        g.fillRect(food_x, food_y, s, s);

        g.setColor(Color.WHITE);
        for(int i = 0; i < length; i++) {
            g.fillRect(x[i], y[i], s, s);
        }
    }

    public void run() {
        while(running) {
            move();
            checkCollision();
            checkFood();
            repaint();
            sleep(100);
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN)
            direction = key;
        if(key == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP)
            direction = key;
        if(key == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT)
            direction = key;
        if(key == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT)
            direction = key;
    }

    private void move() {
        for(int i = length - 1; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch(direction) {
            case KeyEvent.VK_UP:
                y[0] -= s;
                break;
            case KeyEvent.VK_DOWN:
                y[0] += s;
                break;
            case KeyEvent.VK_LEFT:
                x[0] -= s;
                break;
            case KeyEvent.VK_RIGHT:
                x[0] += s;
                break;
        }
    }

    private void checkCollision() {
        if(x[0] < 0 || x[0] >= width || y[0] < 0 || y[0] >= height) {
            running = false;
            System.out.println("Game over");
        }
        for(int i = 1; i < length; i++) {
            if(x[0] == x[i] && y[0] == y[i]) {
                running = false;
                System.out.println("Game over");
            }
        }
    }

    private void checkFood() {
        if(x[0] == food_x && y[0] == food_y) {
            length++;
            generateFood();
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Snake().start();
    }

    private void start() {
        thread = new Thread(this);
        running = true;
        thread.start();
    }

    private JFrame frame = new JFrame("贪吃蛇");

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
