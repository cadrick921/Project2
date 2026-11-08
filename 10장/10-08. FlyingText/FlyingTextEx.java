import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
    private final int FLYING_UNIT = 10;
    private JLabel l;

    public FlyingTextEx() {
        setTitle("FlyingText Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        l = new JLabel("Hello");
        l.setLocation(30, 20);
        l.setSize(100, 20);
        c.add(l);
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    l.setLocation(l.getX(), l.getY() - FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    l.setLocation(l.getX(), l.getY() + FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    l.setLocation(l.getX() - FLYING_UNIT, l.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    l.setLocation(l.getX() + FLYING_UNIT, l.getY());
                    break;
            }

        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
