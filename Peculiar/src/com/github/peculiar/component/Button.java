package com.github.peculiar.component;

import com.github.peculiar.event.Action;

public class Button extends javax.swing.JButton implements UIElement {
    public Button() {
        setBorderPainted(false);
    }
    public Button(String text) {
        super(text);
        setBorderPainted(false);
    }
    public Button(String image_URL, int width, int height, int scale) {
        var image = new javax.swing.ImageIcon(image_URL).getImage();
        var icon = image.getScaledInstance(width, height, scale);
        setIcon(new javax.swing.ImageIcon(icon));
        setBorderPainted(false);
    }
    public void setButtonSize(int width, int height) {
        setPreferredSize(new java.awt.Dimension(width, height));
    }
    public void setUI(java.awt.Font font, java.awt.Color bColor, java.awt.Color fcolor) {
        setFont(font);
        setForeground(fcolor);
        setBackground(bColor);
    }
    @Override
    public void setUI(java.awt.Color bColor, java.awt.Color fcolor) {
        setBackground(bColor);
        setForeground(fcolor);
    }
    @Override
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
    public void addAction(Action action) {
        addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                action.act(e);
            }
        });
    }
}
