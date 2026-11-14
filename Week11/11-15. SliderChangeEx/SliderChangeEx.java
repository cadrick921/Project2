import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
    private JLabel colorLabel;
    private JSlider[] slider = new JSlider[3];

    public SliderChangeEx() {
        setTitle("SliderChangeEvent Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        for (int i = 0; i < slider.length; i++) {
            slider[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            slider[i].setPaintLabels(true);
            slider[i].setPaintTicks(true);
            slider[i].setPaintTrack(true);
            slider[i].setMajorTickSpacing(50);
            slider[i].setMinorTickSpacing(10);
            slider[i].addChangeListener(new MyChangeListener());
            c.add(slider[i]);
        }
        slider[0].setForeground(Color.RED);
        slider[1].setForeground(Color.GREEN);
        slider[2].setForeground(Color.BLUE);
        int r = slider[0].getValue();
        int g = slider[1].getValue();
        int b = slider[2].getValue();
        colorLabel = new JLabel("SLIDER EXAMPLE");
        colorLabel.setOpaque(true);
        colorLabel.setBackground(new Color(r, g, b));
        c.add(colorLabel);
        setSize(300, 230);
        setVisible(true);
    }

    private class MyChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int r = slider[0].getValue();
            int g = slider[1].getValue();
            int b = slider[2].getValue();
            colorLabel.setBackground(new Color(r, g, b));
        }
    }

    public static void main(String[] args) {
        new SliderChangeEx();
    }
}
