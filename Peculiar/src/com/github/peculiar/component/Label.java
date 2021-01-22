package com.github.peculiar.component;

public class Label extends javax.swing.JLabel implements UIElement {

    public Label() {
        super();
    }
    public Label(String text) {
        super(text);
    }
    public Label(String imgURL, int width, int height, int scale) {
        var image = new javax.swing.ImageIcon(imgURL).getImage();
        var icon = image.getScaledInstance(width, height, scale);
        setPreferredSize(new java.awt.Dimension(width, height));
        setIcon(new javax.swing.ImageIcon(icon));

    }

    public void setImage(String imgURL, int width, int height, int scale) {
        var image = new javax.swing.ImageIcon(imgURL).getImage();
        var icon = image.getScaledInstance(width, height, scale);
        setPreferredSize(new java.awt.Dimension(width, height));
        setIcon(new javax.swing.ImageIcon(icon));

    }

    public void setUI(java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setFont(font);
        setForeground(fcolor);
        setBackground(bColor);
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
    public void setLabelSize(int width, int height) {
        setPreferredSize(new java.awt.Dimension(width, height));
    }
}
