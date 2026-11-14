import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame {
    private String[] fruits = { "apple", "banana", "kiwi", "mango" };
    private ImageIcon[] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/kiwi.jpg"), new ImageIcon("images/mango.jpg") };
    private JComboBox<String> strCombo = new JComboBox<String>(fruits);
    private JLabel imgLabel = new JLabel(images[0]);

    public ComboActionEx() {
        setTitle("ComboBoxAction Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        strCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int idx = strCombo.getSelectedIndex();
                imgLabel.setIcon(images[idx]);
            }
        });
        c.add(strCombo);
        c.add(imgLabel);
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
