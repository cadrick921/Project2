import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerEx extends JFrame {
    private JLabel[] l;

    public KeyListenerEx() {
        setTitle("KeyListener Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        l = new JLabel[3];
        l[0] = new JLabel("getKeyCode()");
        l[1] = new JLabel("getKeyChar()");
        l[2] = new JLabel("getKeyText()");
        for (int i = 0; i < l.length; i++) {
            l[i].setOpaque(true);
            l[i].setBackground(Color.YELLOW);
            c.add(l[i]);
        }
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            l[0].setText(Integer.toString(keyCode));
            l[1].setText(Character.toString(keyChar));
            l[2].setText(KeyEvent.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}