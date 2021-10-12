package legv8gui.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class TabController extends JTabbedPane {

    public TabController(){
        Editor e = new Editor();
        e.getInputMap().put(KeyStroke.getKeyStroke("control n"),
                "newTab");
        e.getActionMap().put("newTab",
                new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        addTab("new("+getTabCount()+").lv8asm",new Editor());
                        repaint();
                    }
                });
        addTab("new.lv8asm",e);

    }


}
