package com.peculiar.component;

public class Dialog extends javax.swing.JDialog {
    public Dialog() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | javax.swing.UnsupportedLookAndFeelException e) {
        }
        setModalityType(javax.swing.JDialog.ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(javax.swing.JDialog.DISPOSE_ON_CLOSE);
    }
    public void setDialogLooks(String lookAndFeel) {
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | javax.swing.UnsupportedLookAndFeelException e) {
        }
    }
    public void setDialogSize(int width, int height) {
        super.setSize(width, height);
    }
    public void setDialogIcon(String iconURL) {
        super.setIconImage(new javax.swing.ImageIcon(iconURL).getImage());
    }
    public void showDialog() {
        super.setVisible(true);
    }
    public void hideDialog() {
        super.setVisible(false);
    }

}
