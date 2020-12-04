package com.peculiar.tool;

import java.util.Random;

public class FileNameGenerator {
    private String initialName;
    private int offset;
    public FileNameGenerator(String initialName, int offset) {
        this.initialName = initialName;
        this.offset = offset;
    }

    public String getRandomName() {

        var r = new Random();
        char[] data = new char[offset];
        for (int i = 0; i < offset; i++) {
            var c = (char) (r.nextInt(97));
            if(c!='/'){
                  data[i] = c;
            }
          
        }
        var randomStr = String.valueOf(data);
        return randomStr;
    }

}
