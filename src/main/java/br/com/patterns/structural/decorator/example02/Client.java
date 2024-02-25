package br.com.patterns.structural.decorator.example02;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;

public class Client {

    public static void main(String[] args) {
        var jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());

        var jTextArea = new JTextArea(8, 30);

        // JScrollPane => Decorator which adds vertical/horizontal bars into jTextArea
        var jScrollPane = new JScrollPane(jTextArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jFrame.add(jScrollPane);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 200);
        jFrame.setVisible(true);
    }

}
