package legv8gui.ui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class TabController extends JTabbedPane {
    private static TabController tabController;
    public static TabController getTabController(){
        if(tabController == null)
            tabController = new TabController();
        return tabController;
    }
    private TabController(){
        Editor e = new Editor();
        addTab("new.lv8asm",e);
        addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                boolean b = false;
                for (Component x : getComponents()) {
                    ((Editor) x).stopTimer();
                }
                ((Editor) getSelectedComponent()).startTimer();
            }
        });
    }
    public static void addTab(){
        int i = tabController.getTabCount();
        Editor e = new Editor();
        tabController.addTab("new("+i+").lv8asm",e);
    }
    public static Editor getCurrentEditor(){
        return (Editor) tabController.getSelectedComponent();
    }

}
