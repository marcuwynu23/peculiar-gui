
package com.peculiar.tool;

import java.io.IOException;

public class CommandExecuter {
    public CommandExecuter(){
        
    }
   
    public static void executeScript(String location, String script){
        try {
              Runtime.getRuntime().exec(location + script);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void executeCommand(String command){
    try {
              Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
