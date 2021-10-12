package legv8gui.ui;

import legv8gui.emulator.memory.Memory;

import javax.swing.*;
import java.awt.*;

public class MemoryPanel extends JPanel {
    public static JTextArea textPane = new JTextArea(256,24/*48*/);
    private static JScrollPane scrollPane;
    public MemoryPanel() {
        setBorder(BorderFactory.createTitledBorder("Memory"));
        textPane.setEditable(false);
        scrollPane = new JScrollPane(textPane);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        add(scrollPane);
    }
}
