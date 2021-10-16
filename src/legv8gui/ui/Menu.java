package legv8gui.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JMenuBar {

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

            }
        });
        run.add(runSelected);

        add(run);
    }
}
