package com.peculiar.component;

public class AppForm extends com.peculiar.component.Form {
    public AppForm() {
        super();
        super.setLocationRelativeTo(null);
    }
    public AppForm(com.peculiar.component.Label peculiarLabel) {
        setFormPane(peculiarLabel);
        super.setLocationRelativeTo(null);

    }
    public AppForm(com.peculiar.component.Panel peculiarPanel) {
        setFormPane(peculiarPanel);
        super.setLocationRelativeTo(null);
    }
    public void setAppFullSize() {
        super.setExtendedState(6);
    }
    public void setAppTitle(String title) {
        super.setTitle(title);
    }
    public void setAppSize(int width, int height) {
        super.setFormSize(width, height);
    }
    public void setAppCenterOnScreen() {
        super.setLocationRelativeTo(null);
    }
    public void setAppIcon(String iconURL) {
        super.setFormIcon(iconURL);
    }
    public void setAppResizable(boolean isResizable) {
        super.setResizable(isResizable);
    }
    public void setAppLayout(java.awt.LayoutManager layout) {
        super.setLayout(layout);
    }
    public void showAppForm() {
        super.showForm();
    }
    public void hideAppForm() {
        super.hideForm();
    }

}
