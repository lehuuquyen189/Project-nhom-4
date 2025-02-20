
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField userText;
    private JPasswordField passwordText;
    private LoginController controller;

    public LoginForm() {
        controller = new LoginController(this);

        setTitle("Đăng nhập");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel titleLabel = new JLabel("ĐĂNG NHẬP", SwingConstants.CENTER);
        titleLabel.setBounds(100, 10, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel);

        JLabel userLabel = new JLabel("Tên đăng nhập:");
        userLabel.setBounds(10, 50, 120, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(140, 50, 200, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Mật khẩu:");
        passwordLabel.setBounds(10, 90, 120, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(140, 90, 200, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Đăng nhập");
        loginButton.setBounds(140, 130, 120, 30);
        panel.add(loginButton);

        JButton forgotButton = new JButton("Quên mật khẩu?");
        forgotButton.setBounds(140, 170, 150, 30);
        panel.add(forgotButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                controller.handleLogin(username, password);
            }
        });

        forgotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Vui lòng liên hệ admin để đặt lại mật khẩu.");
            }
        });

        setVisible(true);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}
