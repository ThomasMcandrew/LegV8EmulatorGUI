package legv8gui.ui;

import com.alee.laf.text.WebTextPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor extends WebTextPane {
    private Editor thisEditor;
    private Timer timer;
    private File file;
    public void startTimer(){
        if(!timer.isRunning())
            timer.start();
    }

    public void stopTimer() {
        if(timer.isRunning())
            timer.stop();
    }
    public File save(){
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
    public void saveAs(File ofile){
        try {
            FileWriter writer = new FileWriter(ofile);
            writer.write(getText());
            writer.close();
            file = ofile;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean timerIsRunning(){
        return timer.isRunning();
    }
    public Editor(File filename){
        file = filename;
        thisEditor = this;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    SyntaxHighlighter sh = new SyntaxHighlighter(thisEditor);
                    sh.execute();
                    //find a way to only syntax highlight while selected
            }
        });
        timer.start();
    }
}
