import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
    private JLabel l;

    public MouseListenerAllEx() {
        setTitle("MouseListenerAll Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);
        c.addMouseWheelListener(listener);
        l = new JLabel("No Mouse Event");
        c.add(l);
        setSize(300, 200);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyMouseListener implements MouseListener, MouseMotionListener, MouseWheelListener {
        public void mousePressed(MouseEvent e) {
            l.setText("mousePressed(" + e.getX() + "," + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e) {
            l.setText("mouseReleased(" + e.getX() + "," + e.getY() + ")");
        }

        public void mouseClicked(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {
            Container c = (Container) e.getSource();
            c.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
            Container c = (Container) e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseMoved(MouseEvent e) {
            l.setText("mouseMoved(" + e.getX() + "," + e.getY() + ")");
        }

        public void mouseDragged(MouseEvent e) {
            l.setText("mouseDragged(" + e.getX() + "," + e.getY() + ")");
        }

        public void mouseWheelMoved(MouseWheelEvent e) {
            int n = e.getWheelRotation();
            if (n < 0) {
                l.setText("upWheel");
                Container c = (Container) e.getSource();
                c.setBackground(Color.GREEN);
                setSize(500, 200);
            } else {
                l.setText("downWheel");
                setSize(300, 200);
            }
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
