package legv8gui.ui;

import com.alee.laf.menu.WebMenuBar;
import legv8gui.compiler.Compiler;
import legv8gui.emulator.Runner;
import legv8gui.examples.HelloWorld;
import legv8gui.util.FileUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu extends WebMenuBar {

    public Menu(){
        initFile();
        initRun();
        initExamples();
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
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                File file = FileUtils.OpenFile();
                if(file == null) return;
                TabController.openFile(file);
            }
        });
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
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TabController.getCurrentEditor().saveAs(FileUtils.OpenFile());
            }
        });
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
                if(TabController.getTabController().isDocumentOpened(c.getName())){
                    TabController.getTabController().closeDocument(c.getName());
                }
                TabController.openFile(c);
                Runner runner = new Runner(c);
                runner.execute();
            }
        });
        run.add(runSelected);

        add(run);
    }

    private void initExamples(){
        JMenu example = new JMenu("Examples");
        JMenuItem helloWorld = new JMenuItem("Hello World!");
        helloWorld.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    TabController.addTab("Hello World").setText(HelloWorld.getCode());
                }catch(Exception e){

                }
            }
        });
        example.add(helloWorld);
        add(example);
    }
}
