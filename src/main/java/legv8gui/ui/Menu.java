package legv8gui.ui;

import com.alee.extended.memorybar.WebMemoryBar;
import com.alee.laf.menu.WebMenuBar;
import com.alee.laf.tabbedpane.Tab;
import legv8gui.compiler.Compiler;
import legv8gui.emulator.Runner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu extends WebMenuBar {

    public Menu(){
        initFile();
        initRun();
    }
    private void initFile(){
        JMenu file = new JMenu("File");

        JMenuItem newFile = new JMenuItem("new file");
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TabController.addTab();
            }
        });
        file.add(newFile);

        JMenuItem openFile = new JMenuItem("open file");
        file.add(openFile);

        JMenuItem saveFile = new JMenuItem("save file");
        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TabController.getCurrentEditor().save();
            }
        });
        file.add(saveFile);

        JMenuItem saveAs = new JMenuItem("save(as) file");
        file.add(saveAs);

        add(file);
    }

    private void initRun(){
        JMenu run = new JMenu("Run");

        JMenuItem runSelected = new JMenuItem("run selected");
        runSelected.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                File f = TabController.getCurrentEditor().save();
                File c = Compiler.CompileFile(f);
                TabController.openFile(c);
                Runner runner = new Runner(c);
                runner.execute();
            }
        });
        run.add(runSelected);

        add(run);
    }
}
