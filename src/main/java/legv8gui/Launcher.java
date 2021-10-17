package legv8gui;

import com.alee.laf.WebLookAndFeel;
import legv8gui.emulator.Emulator;
import legv8gui.ui.MainFrame;

import javax.swing.*;

public class Launcher {

    public static void main(String[] args){
        //Add something to start with legv8 extension files

        WebLookAndFeel.install();
        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Emulator emulator = new Emulator();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }

}
