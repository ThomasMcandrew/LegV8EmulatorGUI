package legv8gui.ui;

import com.alee.laf.panel.WebPanel;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.text.WebTextPane;
import com.alee.managers.style.StyleId;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StackPanel extends WebPanel {
    public static WebTextPane textPane = new WebTextPane();
    private static WebScrollPane scrollPane;
    public StackPanel() {
        setBorder(BorderFactory.createTitledBorder("Stack"));
        textPane.setEditable(false);
        textPane.setStyleId(StyleId.textpane);
        scrollPane = new WebScrollPane(textPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setStyleId(StyleId.scrollpaneHovering);
        add(scrollPane);
    }
}
