package legv8gui.util;

import com.alee.laf.filechooser.WebFileChooser;

import java.io.File;

public class FileUtils {

    private static File TempFileLocation = new File(System.getProperty("user.home") + File.separator + ".lv8emu");
    private static File getTempFileLocation(){
        if(!TempFileLocation.exists() || TempFileLocation.isDirectory())
            TempFileLocation.mkdir();
        return TempFileLocation;
    }
    public static File getNewFile(String filename){
        return new File(getTempFileLocation().getAbsolutePath() + File.separator +filename);
    }
    public static File OpenFile(){
        WebFileChooser wfc = new WebFileChooser();
        try{
            return wfc.showOpenDialog();
        }catch(Exception e){
            return null;
        }
    }
}
