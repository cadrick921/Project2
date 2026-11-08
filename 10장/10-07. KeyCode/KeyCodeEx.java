import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
    private JLabel l;

    public KeyCodeEx() {
        setTitle("KeyCode Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        l = new JLabel();
        c.add(l);
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            l.setText(KeyEvent.getKeyText(e.getKeyCode()) + "가 입력되었음");
            Container c = (Container) e.getSource();
            if (e.getKeyChar() == '%') {
                c.setBackground(Color.YELLOW);
            } else if (e.getKeyCode() == KeyEvent.VK_F1) {
                c.setBackground(Color.GREEN);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
