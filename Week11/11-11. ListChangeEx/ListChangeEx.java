import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(10);
    private Vector<String> v = new Vector<String>();
    private JList<String> nameList = new JList<String>(v);

    public ListChangeEx() {
        setTitle("ListChange Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("이름 입력 후 <Enter> 키"));
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                v.add(tf.getText());
                tf.setText("");
                nameList.setListData(v);
            }
        });
        c.add(tf);
        v.add("황기태");
        v.add("이재문");
        nameList.setVisibleRowCount(5);
        nameList.setFixedCellWidth(100);
        c.add(new JScrollPane(nameList));
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListChangeEx();
    }
}
