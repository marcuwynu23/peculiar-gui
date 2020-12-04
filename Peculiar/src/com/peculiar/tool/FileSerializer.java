
package com.peculiar.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerializer {
    private String file;
    public FileSerializer(String file){
       this.file = file;   
    }
    public void serialize(Object dataObject) throws IOException{
        try {
            var f = new FileOutputStream(new File(file));
            var out = new ObjectOutputStream(f);
          out.writeObject(dataObject);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
       
    }
    public Object deserialize(){
        try {
            var f = new FileInputStream(new File(file));
            var in = new ObjectInputStream(f);
            var dataObject = in.readObject();
            return  dataObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
    
