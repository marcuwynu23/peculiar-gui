package com.github.peculiar.app;

import com.github.peculiar.constant.Strings;
import com.github.peculiar.app.initial.ContentPane;
import com.github.peculiar.component.AppForm;
import com.github.peculiar.component.Button;
import com.github.peculiar.constant.Color;
import com.github.peculiar.constant.Default;
import com.github.peculiar.constant.Layout;
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
