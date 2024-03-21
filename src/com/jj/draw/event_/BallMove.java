package com.jj.draw.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/19 21:22
 **/
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口JFrame对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//画板，可以画出小球
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {

    //为了让小球可以移动，把他的左上角坐标（x，y）设置变量
    int x = 100;
    int y = 10;

    //有字符输出的时候该方法会被触发
    @Override
    public void keyTyped(KeyEvent e) {


    }

    //当某个键被按下时，会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode() + "被按下");

        //根据用户按下的不同建来处理小球的移动（上下左右的建）
        //在java中，会给每一个建分配一个int值
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {//KeyEvent.VK_DOWN就是向下的方向对应的code
            y += 10;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        //让面板重绘
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);//默认黑色
    }

    //当某个建释放（松开），该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
