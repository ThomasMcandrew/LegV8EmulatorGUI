package legv8gui.ui;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Editor extends JTextPane {
    private Editor thisEditor;
    private Timer timer;
    public void startTimer(){
        if(!timer.isRunning())
            timer.start();
    }
    public void stopTimer() {
        if(timer.isRunning())
            timer.stop();
    }
    public boolean timerIsRunning(){
        return timer.isRunning();
    }
    public Editor(){
        thisEditor = this;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    SyntaxHighlighter sh = new SyntaxHighlighter(thisEditor);
                    sh.execute();
                    //find a way to only syntax highlight while selected
                    System.out.println(getText());
            }
        });

        timer.start();
    }
}
