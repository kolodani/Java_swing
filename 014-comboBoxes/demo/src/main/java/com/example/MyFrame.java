package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setMinimumSize(new Dimension(100, 100));

        String[] animals = { "dog", "cat", "bird" };
        // no se puede hacer de enteros asi
        // int[] numbers = {1, 2, 3};
        // se tiene que hacer con una clase como String
        // Integer[] numbers = {1, 2, 3};
        // Double[] numbers = {1.0, 2.0, 3.0};
        // Character[] numbers = {'a', 'b', 'c'};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("pig", 0);
        // comboBox.setSelectedIndex(0);
        // comboBox.removeItem("cat");
        // comboBox.removeItemAt(0);
        // comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
