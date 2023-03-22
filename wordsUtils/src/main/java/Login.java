import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JTextField tf;
    JPasswordField pf;
    JButton button;
    public Login() {
        setTitle("登录界面");
        setSize(280, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1 = new JLabel("用户名:");
        label2 = new JLabel("密码:");
        label3 = new JLabel("");
        tf = new JTextField();
        pf = new JPasswordField();
        button = new JButton("登录");
        Container c = getContentPane();
        c.setLayout(null);
        label1.setBounds(40, 30, 60, 20);
        tf.setBounds(100, 30, 100, 20);
        label2.setBounds(40, 60, 60, 20);
        pf.setBounds(100, 60, 100, 20);
        button.setBounds(100, 100, 60, 20);
        label3.setBounds(60, 130, 180, 20);
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(pf);
        c.add(button);
        c.add(label3);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = tf.getText();
            String password = new String(pf.getPassword());
            if (name.equals("admin") && password.equals("123456")) {
                label3.setText("登录成功");
            } else {
                label3.setText("用户名或密码错误");
            }
        }
    }
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}