import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndependentClassListenerEx extends JFrame {
    public IndependentClassListenerEx() {
        setTitle("IndependentClassListener Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b = new JButton("Action");
        b.addActionListener(new MyActionListener());
        c.add(b);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndependentClassListenerEx();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b.getText().equals("Action")) {
            b.setText("액션");
        } else {
            b.setText("Action");
        }
    }
}