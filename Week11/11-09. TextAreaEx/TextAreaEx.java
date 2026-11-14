import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx extends JFrame {
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7, 20);

    public TextAreaEx() {
        setTitle("TextArea Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText() + "\n");
                tf.setText("");
            }
        });
        c.add(tf);
        c.add(new JScrollPane(ta));
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx();
    }
}
