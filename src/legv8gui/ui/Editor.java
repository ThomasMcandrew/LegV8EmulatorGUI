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
    public Editor(){
        thisEditor = this;
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    SyntaxHighlighter sh = new SyntaxHighlighter(thisEditor);
                    sh.execute();
            }
        });
        t.start();
    }
}
