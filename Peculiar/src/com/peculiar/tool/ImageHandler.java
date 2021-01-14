
package com.peculiar.tool;

import javax.swing.ImageIcon;


public class ImageHandler {
    private String imgURL;
    private ImageIcon imgIcon;
    public ImageHandler(String imgURL) {
        this.imgURL =imgURL;
        imgIcon =new ImageIcon(imgURL);
    }
    
    public ImageHandler(String imgURL,int w,int h,int s){
        var image = new javax.swing.ImageIcon(imgURL).getImage();
        var icon = image.getScaledInstance(w, h, s);
        imgIcon = new ImageIcon(icon);
    }
    public ImageIcon getImageIcon(){
        return new ImageIcon(imgURL);
    }
    public java.awt.Image getImage(){
        return imgIcon.getImage();
    }
}
