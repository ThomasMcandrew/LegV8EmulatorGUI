package legv8gui.ui;

import com.alee.extended.tab.DocumentData;
import com.alee.extended.tab.WebDocumentPane;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.managers.style.StyleId;
import legv8gui.util.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TabController extends WebDocumentPane {
    private static TabController tabController;
    public static TabController getTabController(){
        if(tabController == null)
            tabController = new TabController();
        return tabController;
    }
    private TabController(){
        Editor e = new Editor(FileUtils.getNewFile("new.lv8asm"));
        WebScrollPane scrollPane = new WebScrollPane(e);
        scrollPane.setStyleId(StyleId.scrollpaneHovering);
        DocumentData documentData = new DocumentData("new.lv8asm", "new.lv8asm",scrollPane);
        openDocument(documentData);
    }
    public static void openFile(File file){
        String text = "";
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                text+=scan.nextLine() + "\n";
            }
            Editor e = new Editor(file);
            e.setText(text);
            WebScrollPane scrollPane = new WebScrollPane(e);
            scrollPane.setStyleId(StyleId.scrollpaneHovering);
            DocumentData documentData = new DocumentData(file.getName(),file.getName(),scrollPane);
            tabController.openDocument(documentData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void addTab(){
        int i = tabController.getDocumentsCount();
        String name = i == 0 ? "new.lv8asm" : "new("+i+").lv8asm";
        Editor e = new Editor(FileUtils.getNewFile(name));
        WebScrollPane scrollPane = new WebScrollPane(e);
        scrollPane.setStyleId(StyleId.scrollpaneHovering);
        DocumentData documentData = new DocumentData(name,name,scrollPane);
        tabController.openDocument(documentData);
    }
    public static Editor addTab(String filename){
        int i = tabController.getDocumentsCount();
        Editor e = new Editor(FileUtils.getNewFile(filename));
        WebScrollPane scrollPane = new WebScrollPane(e);
        scrollPane.setStyleId(StyleId.scrollpaneHovering);
        DocumentData documentData = new DocumentData(filename,filename,scrollPane);
        tabController.openDocument(documentData);
        return e;
    }
    public static Editor getCurrentEditor(){
        return (Editor) ((WebScrollPane) tabController.getSelectedDocument().getComponent()).getViewport().getView();
    }

}
