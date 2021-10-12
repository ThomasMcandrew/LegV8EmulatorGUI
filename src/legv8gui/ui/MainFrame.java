package legv8gui.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private MainPanel mainPanel = new MainPanel();
    public MainFrame(){
        super("Leg V8 Assembly Emulator");
        setPreferredSize(new Dimension(500,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
        pack();
    }
}
