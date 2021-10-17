package legv8gui.util;

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
}
