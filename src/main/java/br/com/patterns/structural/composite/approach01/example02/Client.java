package br.com.patterns.structural.composite.approach01.example02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Client {

    public static void main(String[] args) {
        // Elements which are Containers
        var title = new JLabel("Search");
        var label = new JLabel("Click to search");
        var searchBtn = new JButton("Search");

        // Adding label and button into JPanel, which is algo a Container
        var jPanel = new JPanel(new FlowLayout());
        jPanel.add(label);
        jPanel.add(searchBtn);

        // Adding panel and title into jFrame, which is also a Container
        var jFrame = new JFrame();
        jFrame.setLayout(new BorderLayout());
        jFrame.add(title, BorderLayout.NORTH);
        jFrame.add(jPanel, BorderLayout.CENTER);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 200);
        jFrame.setVisible(true);
    }


    }
}
