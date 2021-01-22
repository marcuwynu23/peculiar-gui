/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.peculiar.tool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


    public  class DataFileCreator {
        private List data;
        private String fileName;
        private final ObjectFileCreator t = new ObjectFileCreator();
       
        public DataFileCreator(List dataList, String binName,String path) {
            new File(path).mkdir();
            var fileName = path +"/"+binName;
            var file = new File(fileName);
            this.fileName = fileName;
            if (file.exists()) {
                dataList = (ArrayList) t.readObjectFile(fileName);
                this.data = dataList;

            } else {
                data = dataList;
            }
        }
        public DataFileCreator(String binName,String path){
            data = new ArrayList();
            fileName = path + "/"+binName;
            
        }
        public void appendDataToFile(int index,Object dataObject) {
            data.add(index,dataObject);
        }
       public void removeDataFromFile(int index){
            data.remove(index);
       }
        public Object getDataFromFile(){
           return t.readObjectFile(fileName);
        }

        public void createFile() {
            t.createObjectFile(data, fileName);
        }
        

    }