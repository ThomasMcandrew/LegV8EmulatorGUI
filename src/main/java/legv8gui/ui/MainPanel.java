package legv8gui.ui;

import com.alee.laf.panel.WebPanel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends WebPanel {
    private RegisterPanel registerPanel = new RegisterPanel();
    private JSplitPane splitPane = new JSplitPane();
    private MemoryPanel memoryPanel = new MemoryPanel();
    private StackPanel stackPanel = new StackPanel();
    private TabController tabController = TabController.getTabController();
    private Terminal terminal = new Terminal();
    private ToolBar toolBar = new ToolBar();
    public MainPanel(){
        setLayout(new BorderLayout());
        add(registerPanel, BorderLayout.NORTH);
        add(memoryPanel,BorderLayout.WEST);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(400);
        splitPane.setTopComponent(tabController);
        splitPane.setBottomComponent(terminal);
//        JPanel centerPanel = new JPanel();
//        centerPanel.add(toolBar,BorderLayout.NORTH);
//        centerPanel.add(splitPane, BorderLayout.SOUTH);
        add(splitPane,BorderLayout.CENTER);
        //add(tabController,BorderLayout.CENTER);
        add(stackPanel, BorderLayout.EAST);
    }
}
