package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class HomePanel {
    JFrame _frame;
    private JPanel _panel;
    public HomePanel() {
        _frame = new JFrame("Welcome to JobLogger");
        _panel =  new JPanel();
        _panel.setLayout(new GridLayout(0, 2));
    }
}