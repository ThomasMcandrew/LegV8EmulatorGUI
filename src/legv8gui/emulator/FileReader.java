package legv8gui.emulator;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class FileReader {
    public static String[] readFile(String path) throws IOException {
        File file = new File(path);
        return readFileHelper(file);
    }
    public static String[] readFile(File file) throws IOException {
        return readFileHelper(file);
    }
    private static String[] readFileHelper(File file) throws IOException {
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];//may need work
        in.read(bytes);
        in.close();
        ArrayList<String> Instruction = new ArrayList<String>();
        String temp = "";
        int i = 0;
        while(i < bytes.length){
            temp += String.format("%8s", Integer.toBinaryString(bytes[i] & 0xFF)).replace(' ', '0');
            i++;
            if(i%4 == 0){
                Instruction.add(temp);
                temp = new String("");
            }
        }
        String[] val = new String[Instruction.size()];
        for(i = 0; i < val.length; i++){
            val[i] = Instruction.get(i);
        }
        return val;
    }
    public static File openFile(){
        final JFileChooser fc = new JFileChooser();
        //fc.setLocation(100, 100);
        fc.setMultiSelectionEnabled(false);
        fc.addChoosableFileFilter(new FileNameExtensionFilter("ASSEMBLY","machine"));
        fc.setAcceptAllFileFilterUsed(true);
        fc.requestFocusInWindow();
        fc.requestFocus();
        int returnVal = fc.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            return file;
        }
        return null;
    }

}
