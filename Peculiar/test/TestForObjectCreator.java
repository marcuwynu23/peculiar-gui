
import com.github.peculiar.tool.DataFileCreator;
import com.github.peculiar.tool.DataFileObject;
import com.github.peculiar.tool.ObjectFileCreator;

import java.io.IOException;

public class TestForObjectCreator {

    public static void main(String[] args) throws IOException {
        var t = new ObjectFileCreator();
        var array = new java.util.ArrayList<>();
        array.add(0,new String("hhee"));
        var d = new DataFileCreator(array,"object.bin", "./bin");
        
        d.removeDataFromFile(1);
        d.createFile();
        System.out.println(d.getDataFromFile());
    }
}

class GameObject extends DataFileObject {
    private String name;
    private int coorX, coorY;

    public GameObject(String name, int coorX, int coorY) {
        this.name = name;
        this.coorX = coorX;
        this.coorY = coorY;
    }
}
