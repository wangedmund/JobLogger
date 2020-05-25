package main;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUI implements ActionListener {
    private JLabel _label;
    private JFrame _frame;
    private JPanel _panel;
    private int _count = 0;
    public GUI() {
        _frame = new JFrame();

        JButton button = new JButton("Click");
        button.addActionListener(this);
        _panel = new JPanel();
        _label = new JLabel("# of clicks: 0");

        _panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        _panel.setLayout(new GridLayout(0, 1));
        _panel.add(button);
        _panel.add(_label);

        _frame.add(_panel, BorderLayout.CENTER);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setTitle("JobLogger");
        _frame.pack();
        _frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        _count++;
        _label.setText("# of clicks: " + _count);
    }
    public static void main(String[] args) {
        new GUI();
    }
}