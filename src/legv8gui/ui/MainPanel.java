package legv8gui.ui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private RegisterPanel registerPanel = new RegisterPanel();
    private JSplitPane splitPane = new JSplitPane();
    private MemoryPanel memoryPanel = new MemoryPanel();
    private StackPanel stackPanel = new StackPanel();
    private TabController tabController = new TabController();
    private Terminal terminal = new Terminal();
    public MainPanel(){
        setLayout(new BorderLayout());
        add(registerPanel, BorderLayout.NORTH);
        add(memoryPanel,BorderLayout.WEST);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(550);
        splitPane.setTopComponent(tabController);
        splitPane.setBottomComponent(terminal);
        add(splitPane,BorderLayout.CENTER);
        //add(tabController,BorderLayout.CENTER);
        add(stackPanel, BorderLayout.EAST);
    }
}
