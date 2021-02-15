package com.ersen.designs.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsRunner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JTextField textField = new JFormattedTextField();
        textField.setBounds(50, 50, 120, 20);

        JButton button = new JButton();
        button.setText("Click Here");
        button.setBounds(50, 100, 95, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Welcome to Design");
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
