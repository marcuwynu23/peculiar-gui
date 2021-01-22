
package com.github.peculiar.component;

public class TextArea extends javax.swing.JTextArea implements UIElement{
      public void setUI(javax.swing.border.Border border, java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setBorder(border);
        setFont(font);
        setBackground(bColor);
        setForeground(fcolor);
    }
    @Override
    public void setUI(java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setFont(font);
        setBackground(bColor);
        setForeground(fcolor);
    }
    @Override
    public void setUI(javax.swing.border.Border border, java.awt.Color bColor, java.awt.Color fcolor) {
        setBorder(border);
        setBackground(bColor);
        setForeground(fcolor);
    }
    @Override
    public void setUI(java.awt.Color bColor, java.awt.Color fcolor) {
        setBackground(bColor);
        setForeground(fcolor);
    }
    
}
