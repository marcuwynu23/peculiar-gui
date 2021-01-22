package com.github.peculiar.component;

public class TextField extends javax.swing.JTextField implements UIElement {
    public TextField(int col) {
        super(col);
    }

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
