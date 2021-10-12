package legv8gui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Terminal extends JTextArea {

    public Terminal(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(e.getKeyChar() == '\n'){
                    String[] foo = getText().split("\n");
                    System.out.println(foo[foo.length-1]);
                }
            }
        });
        setLineWrap(true);
        setAutoscrolls(true);
        
    }

}
