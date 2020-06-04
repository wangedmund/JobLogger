package main;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class RegisterPanel {
    JFrame _frame;
    private JPanel _panel;
    public RegisterPanel() {
        _frame = new JFrame("Register for JobLogger");
        _panel = new JPanel();
        _panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        _panel.setLayout(new BoxLayout(_panel, BoxLayout.PAGE_AXIS));
        JLabel label1 = new JLabel("Register");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        JLabel label2 = new JLabel("Username: ");
        label2.setFont(new Font("Verdana", Font.PLAIN, 12));
        JTextField usernameField = new JTextField();
        JLabel label3 = new JLabel("Password: ");
        label3.setFont(new Font("Verdana", Font.PLAIN, 12));
        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(200, 24));
        JLabel label4 = new JLabel("Confirm your password: ");
        label4.setFont(new Font("Verdana", Font.PLAIN, 12));
        JPasswordField passwordField2 = new JPasswordField();
        JButton signUpButton = new JButton("Sign Up");
        JButton cancelButton = new JButton("Cancel");
        _panel.add(label1);
        _panel.add(label2);
        _panel.add(usernameField);
        _panel.add(label3);
        _panel.add(passwordField);
        _panel.add(label4);
        _panel.add(passwordField2);
        _panel.add(signUpButton);
        _panel.add(cancelButton);
        
        _frame.add(_panel, BorderLayout.CENTER);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.pack();
        // _frame.setSize(275, 250);
        _frame.setLocationRelativeTo(null);
        _frame.setVisible(true);;
    }
    public static void main(String[] args) {
        new RegisterPanel();
    }
}