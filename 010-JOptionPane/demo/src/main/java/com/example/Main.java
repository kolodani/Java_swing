package com.example;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Informacion poco util", "Titulo",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Informacion util", "Titulo",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Informacion???", "Titulo",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Computadora con viruta", "Titulo",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Llamar a soporte", "Titulo",
        // JOptionPane.ERROR_MESSAGE);

        // System.out.println(
        // JOptionPane.showConfirmDialog(null, "Sabes que estas haciendo", "Titulito",
        // JOptionPane.YES_NO_CANCEL_OPTION)
        // );
        // int answer = JOptionPane.showConfirmDialog(null, "Sabes que estas haciendo",
        // "Titulito", JOptionPane.YES_NO_CANCEL_OPTION);

        // String name = JOptionPane.showInputDialog("Cual es tu nombre");
        // System.out.println("Hola " + name);

        String[] responses = { "No, tu eres genial", "Gracias", "Sonrojarse" };
        ImageIcon icon = new ImageIcon("demo/src/main/resources/sorpresa.png");
        JOptionPane.showOptionDialog(
                null,
                "Eres Genial",
                "Mensaje a Grover",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);
    }
}
