package main;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class HomePanel {
    JFrame _frame;
    private JPanel _panel;
    public HomePanel() {
        _frame = new JFrame("Welcome to JobLogger, dfgdsfgdsfgsf");
        _frame.getContentPane().setLayout(new GridLayout(2,1));
        _panel =  new JPanel();
        // _panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        _panel.setLayout(new GridLayout(1, 1, 2, 2));
        JPanel _panel2 = new JPanel(new GridLayout(3, 2, 10, 10));
       
        JLabel label1 = new JLabel("Welcome, Name");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        // label1.setAlignmentX(CENTER_ALIGNMENT);
        JButton jobStatsButton = new JButton("View Job Stats");
        JButton newJobButton = new JButton("Add New Job");
        JButton internStatsButton = new JButton("View Intern Stats");
        JButton addFriendButton = new JButton("Add New Friend");
        JButton seeFriendButton = new JButton("See Your Friends");
        _panel.add(label1);
        _panel2.add(jobStatsButton);
        _panel2.add(internStatsButton);
        _panel2.add(newJobButton);
        _panel2.add(addFriendButton);
        _panel2.add(seeFriendButton);

        // _frame.add(_panel, BorderLayout.CENTER);
        _frame.getContentPane().add(_panel);
        _frame.getContentPane().add(_panel2);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // _frame.setTitle("JobLogger");
        _frame.pack();
        _frame.setLocationRelativeTo(null);
        _frame.setVisible(true);;


    }
    public static void main(String[] args) {
        new HomePanel();
    }
}