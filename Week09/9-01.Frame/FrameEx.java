import java.awt.*;
import javax.swing.*;

public class FrameEx extends JFrame {
    public FrameEx() {
        setTitle("Frame Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameEx();
    }
}