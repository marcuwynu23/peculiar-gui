
package com.peculiar.component;

public class Panel extends javax.swing.JPanel implements UIElement{
    
    public Panel(){
        super();
    }
    public void setPanelSize(int width,int height){
        super.setPreferredSize(new java.awt.Dimension(width, height));
    }
   
    public void setUI(java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setFont(font);
        setBackground(bColor);
        setForeground(fcolor);
    }
    public void setUI(java.awt.Color bColor, java.awt.Color fcolor) {
        setBackground(bColor);
        setForeground(fcolor);
    }
   
    public void setUI(javax.swing.border.Border border, java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setBorder(border);
        setFont(font);
        setBackground(bColor);
        setForeground(fcolor);
    }
  
    public void setUI(javax.swing.border.Border border, java.awt.Color bColor, java.awt.Color fcolor) {
         setBorder(border);
        setBackground(bColor);
        setForeground(fcolor);
    }
}
