package legv8gui.ui;

import legv8gui.compiler.Compiler;
import legv8gui.emulator.Emulator;

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
                    String line = foo[foo.length-1];
                    System.out.println(line);
                    String bin = Compiler.CompileLine(line);
                    Emulator.run(bin);
                    System.out.println(bin);
                }
            }
        });
        setLineWrap(true);
        setAutoscrolls(true);
        
    }

}
