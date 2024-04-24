package com.example;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("demo/src/main/resources/folder-icon.png");
        saveIcon = new ImageIcon("demo/src/main/resources/floppy-disk.png");
        exitIcon = new ImageIcon("demo/src/main/resources/door-icon.png");

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("EXIT");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help

        loadItem.setMnemonic(KeyEvent.VK_L); // l for Load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for Save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for Exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("'beep boop' you loaded a file");
        }
        if (e.getSource() == saveItem) {
            System.out.println("'beep boop' you save a file");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
