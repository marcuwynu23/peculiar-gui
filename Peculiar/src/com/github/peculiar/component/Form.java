package com.github.peculiar.component;

public class Form extends javax.swing.JFrame {
    public Form() {
        setInit();
    }
    private void setInit() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | javax.swing.UnsupportedLookAndFeelException e) {
        }
        super.setSize(com.github.peculiar.constant.Default.WIDTH, com.github.peculiar.constant.Default.HEIGHT);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(3);
        super.setVisible(false);
    }

    public void setAppLooks(String lookAndFeel) {
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | javax.swing.UnsupportedLookAndFeelException e) {
        }
    }
    public void setFormPane(java.awt.Container container){
        setContentPane(container);
    }
    public void setFormIcon(String iconURL) {
        super.setIconImage(new javax.swing.ImageIcon(iconURL).getImage());
    }
    public void showForm() {
        super.setVisible(true);
    }
    public void hideForm() {
        super.setVisible(false);
    }
    public void setFormSize(int width, int height) {
        super.setSize(width, height);
    }

}
