package main;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePanel {
    JFrame _frame;
    private JPanel _panel;
    public WelcomePanel() {
        _frame = new JFrame("Welcome to JobLogger");
        _panel =  new JPanel();
        _panel.setLayout(new BoxLayout(_panel, BoxLayout.PAGE_AXIS));
        JLabel label1 = new JLabel("Welcome to JobLogger ");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        JLabel label2 = new JLabel("Username: ");
        label2.setFont(new Font("Verdana", Font.PLAIN, 12));
        JTextField usernameField = new JTextField();
        JLabel label3 = new JLabel("Password: ");
        label3.setFont(new Font("Verdana", Font.PLAIN, 12));
        JPasswordField passwordField = new JPasswordField();
        JButton signInButton = new JButton("Sign In");
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                _frame.setVisible(false);
                _frame.dispose();
            }
        });
        _panel.add(label1);
        _panel.add(label2);
        _panel.add(usernameField);
        _panel.add(label3);
        _panel.add(passwordField);
        _panel.add(signInButton);
        _panel.add(signUpButton);

        _frame.add(_panel, BorderLayout.CENTER);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // _frame.setTitle("JobLogger");
        _frame.pack();
        _frame.setLocationRelativeTo(null);
        _frame.setVisible(true);;
    }
    public static void main(String[] args) {
        new WelcomePanel();
    }
}