package legv8gui.ui;

import legv8gui.compiler.Compiler;
import legv8gui.emulator.Emulator;

import javax.swing.*;
import javax.swing.text.Keymap;
import java.awt.*;
import java.awt.event.*;

public class Terminal extends JTextArea {

    private boolean carrotInvalid = false;
    public Terminal(){
        setText(">>>");
        getKeymap().addActionForKeyStroke(KeyStroke.getKeyStroke("UP"), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                carrotInvalid = true;
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                //super.keyTyped(e);
                if(carrotInvalid){
                    setCaretPosition(getText().length());
                }
                if(e.getKeyChar() == '\n'){
                    String[] foo = getText().split("\n");
                    String line = foo[foo.length-1].substring(3);
                    String bin = Compiler.CompileLine(line);
                    if(bin == null){
                        bin = "Invalid Command";
                    }
                    setText(getText() + bin + "\n");
                    Emulator.run(bin);
                    setText(getText() + ">>>");
                    setCaretPosition(getText().length());
                }
            }
        });

        setLineWrap(true);
        setAutoscrolls(true);
        
    }
}
