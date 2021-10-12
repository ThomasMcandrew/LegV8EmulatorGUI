package legv8gui.ui;

import javax.swing.*;

public class StackPanel extends JPanel {
    public static JTextArea textPane = new JTextArea(256,13/*48*/);
    private static JScrollPane scrollPane;
    public StackPanel() {
        setBorder(BorderFactory.createTitledBorder("Stack"));
        textPane.setEditable(false);
        scrollPane = new JScrollPane(textPane);
        add(scrollPane);
    }
}
