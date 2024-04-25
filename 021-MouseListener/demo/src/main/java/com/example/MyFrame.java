package com.example;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon beso;
    ImageIcon lengua;
    ImageIcon lentes;
    ImageIcon sonrisa;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        beso = new ImageIcon("demo/src/main/resources/cara-beso.png");
        lengua = new ImageIcon("demo/src/main/resources/cara-lengua.png");
        lentes = new ImageIcon("demo/src/main/resources/cara-lentes.png");
        sonrisa = new ImageIcon("demo/src/main/resources/cara-sonrisa.png");

        label.setIcon(beso);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // System.out.println("You clicked the label!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // System.out.println("You pressed the label!");
        // label.setBackground(Color.yellow);
        label.setIcon(lengua);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("You released the label!");
        // label.setBackground(Color.green);
        label.setIcon(sonrisa);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // System.out.println("You entered the label!");
        // label.setBackground(Color.blue);
        label.setIcon(lentes);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // System.out.println("You exited the label!");
        // label.setBackground(Color.red);
        label.setIcon(beso);
    }

}
