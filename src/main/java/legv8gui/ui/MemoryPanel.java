package legv8gui.ui;

import com.alee.laf.panel.WebPanel;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.text.WebTextPane;
import com.alee.laf.text.WebTextPaneUI;
import com.alee.managers.style.StyleId;
import legv8gui.emulator.memory.Memory;

import javax.swing.*;
import java.awt.*;

public class MemoryPanel extends WebPanel {
    public static WebTextPane textPane = new WebTextPane();
    private static WebScrollPane scrollPane;
    public MemoryPanel() {
        setBorder(BorderFactory.createTitledBorder("Memory"));
        //setStyleId(StyleId.textpaneDecorated);
        //textPane.setEditable(false);
        textPane.setEditable(false);

        scrollPane = new WebScrollPane(textPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setStyleId(StyleId.scrollpaneHovering);
        add(scrollPane);
    }
}
