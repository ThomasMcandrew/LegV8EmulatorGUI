package legv8gui.ui;

import com.alee.extended.tab.DocumentData;
import com.alee.extended.tab.WebDocumentPane;
import com.alee.managers.icon.Icons;
import legv8gui.util.FileUtils;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class TabController extends WebDocumentPane {
    private static TabController tabController;
    public static TabController getTabController(){
        if(tabController == null)
            tabController = new TabController();
        return tabController;
    }
    private TabController(){
        Editor e = new Editor(FileUtils.getNewFile("new.lv8asm"));
        DocumentData documentData = new DocumentData("new.lv8asm", "new.lv8asm",e);
        openDocument(documentData);
//        addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent changeEvent) {
//                boolean b = false;
//                for (Component x : getComponents()) {
//                    ((Editor) x).stopTimer();
//                }
//                ((Editor) getSelectedComponent()).startTimer();
//            }
//        });
    }
    public static void openFile(File file){
        String text = "";
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                text+=scan.nextLine() + "\n";
            }
            Editor e = new Editor(file);
            e.setText(text);
            DocumentData documentData = new DocumentData(file.getName(),file.getName(),e);
            tabController.openDocument(documentData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void addTab(){
        int i = tabController.getDocumentsCount();
        String name = i == 0 ? "new.lv8asm" : "new("+i+").lv8asm";
        Editor e = new Editor(FileUtils.getNewFile(name));
        DocumentData documentData = new DocumentData(name,name,e);
        tabController.openDocument(documentData);
    }
    public static Editor getCurrentEditor(){
        return (Editor) tabController.getSelectedDocument().getComponent();
    }

}
