import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDoubleClickEx extends JFrame {
    public MouseDoubleClickEx() {
        setTitle("MouseDoubleClick Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                Container c = (Container) e.getSource();
                c.setBackground(new Color(r, g, b));
            }
        }
    }

    public static void main(String[] args) {
        new MouseDoubleClickEx();
    }
}
