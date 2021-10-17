package legv8gui.ui;

import com.alee.laf.menu.WebMenuBar;
import com.alee.laf.window.WebFrame;
import com.alee.managers.style.StyleId;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends WebFrame {
    private MainPanel mainPanel = new MainPanel();
    private Menu menuBar = new Menu();
    public MainFrame(){
        super("Leg V8 Assembly Emulator");
        setStyleId(StyleId.frameDecorated);
        setPreferredSize(new Dimension(1200,800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setJMenuBar(menuBar);
        setVisible(true);
        pack();
    }
}
