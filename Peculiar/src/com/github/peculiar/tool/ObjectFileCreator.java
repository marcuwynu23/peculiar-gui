package com.github.peculiar.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectFileCreator {

    public void createObjectFile(Object data, String filePath) {
        try {
            var objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filePath)));
            objectOutputStream.writeObject(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Object readObjectFile(String filePath) {
        Object obj;
        try {
            var objectInputStream = new ObjectInputStream(new FileInputStream(new File(filePath)));
            obj = objectInputStream.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
