package com.peculiar.app;

import com.peculiar.constant.Strings;
import com.peculiar.app.initial.ContentPane;
import com.peculiar.component.AppForm;
import com.peculiar.component.Button;
import com.peculiar.constant.Color;
import com.peculiar.constant.Default;
import com.peculiar.constant.Layout;
import java.awt.GridBagConstraints;

class AppRegisterForm extends AppForm{
    private final Strings str = new Strings();
    private Button saveBtn;

    public AppRegisterForm() {
        super(new ContentPane());
        setApp();
    }
    private void setApp() {
        setAppInit();
        setAppComponents();
        setAppUI();
    }

    public void setAppInit() {
        setAppTitle(str.REGISTER[0]);
        setAppSize(Default.WIDTH, Default.HEIGHT);
        setAppResizable(false);
        setAppLayout(Layout.GRIDBAG);
    }

    public void setAppComponents() {
        saveBtn = new Button(str.REGISTER[1]);
        var gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(saveBtn, gc);
    }

    public void setAppUI() {
        saveBtn.setUI(new java.awt.Color(11, 19, 201), Color.PRIMARY);
    }

    public Button getSaveBtn() {
        return saveBtn;
    }
}
