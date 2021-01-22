package com.github.peculiar.tool;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileLister {
    private Scanner scan;
    private String folderName;
    private final String currentDirector = System.getProperty("user.dir");
    private File folder;
    private File[] fileList;
  

    public FileLister(String folderName) {
        this.folderName = folderName;
        folder = new File(folderName);
    }
    public String getStringOfFileList() {
           var fileListStr = "";
        try {
            fileList = folder.listFiles();
            for (var file : fileList) {
                fileListStr += file+"\n";
            }
            return fileListStr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<String> getArrayOfFileList(){
        List<String> arrayList = null;
        try {
          var  fileLists = folder.listFiles();
          for(var filelist : fileLists){
              arrayList.add(filelist.toString());
          } 
        } catch (Exception e) {
        }
        return null;
    }
}
