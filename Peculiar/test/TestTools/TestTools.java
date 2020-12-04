package TestTools;

import com.peculiar.tool.FileNameGenerator;
import com.peculiar.tool.FileSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

class Person implements Serializable {
   private String name;
}

public class TestTools {
    public static void main(String[] args) {
        
       
       var f = new FileNameGenerator("d",12);
        System.out.println(f.getRandomName());
        var ser = new FileSerializer("maa");
        try {
            ser.serialize(new Person());
        } catch (IOException ex) {
            Logger.getLogger(TestTools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
