package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon burgerIcon;
    ImageIcon hotdogIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("demo/src/main/resources/pizza.png");
        burgerIcon = new ImageIcon("demo/src/main/resources/burger.png");
        hotdogIcon = new ImageIcon("demo/src/main/resources/hotdog.png");

        pizzaButton = new JRadioButton("Pizza");
        burgerButton = new JRadioButton("Burger");
        hotdogButton = new JRadioButton("Hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        burgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        burgerButton.setIcon(burgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered Pizza");
        } else if (e.getSource() == burgerButton) {
            System.out.println("You ordered Burger");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered Hotdog");
        }
    }
}
