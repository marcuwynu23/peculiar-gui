package com.github.peculiar.app;

import com.github.peculiar.constant.Strings;
import com.github.peculiar.app.auth.UserModel;
import com.github.peculiar.app.initial.ContentPane;
import com.github.peculiar.component.AppForm;
import com.github.peculiar.component.Button;
import com.github.peculiar.component.Label;
import com.github.peculiar.constant.Color;
import com.github.peculiar.constant.Default;
import com.github.peculiar.constant.Font;
import com.github.peculiar.constant.Layout;
import java.awt.Insets;
import java.util.ArrayList;

public final class AppAuthForm extends AppForm  {
    private final Strings str = new Strings();
    public Label titleLabel;
    
    private AppLoginForm loginForm;
    private AppRegisterForm registerForm;
    private AppRecoveryForm recoveryForm;
    private ArrayList<UserModel> database;
    
    public Button loginBtn,registerBtn,recoveryBtn,submitBtn,saveBtn;

//Main form for User Authentication
    public AppAuthForm() {
        super(new ContentPane());
        database = new ArrayList<UserModel>();
        setAppInit();
        setAppComponents();
        setAppConstraints();
        setAppUI();
    }
    public void setAppInit() {
        setAppSize(Default.WIDTH, Default.HEIGHT);
        setAppResizable(false);
        setAppLayout(Layout.GRIDBAG);
    }

    public void setAppComponents() {
        titleLabel = new Label(str.AUTH[0]);
        loginBtn = new Button(str.AUTH[1]);
        recoveryBtn = new Button(str.AUTH[2]);
        registerBtn = new Button(str.AUTH[3]);

        loginForm = new AppLoginForm();
        submitBtn = loginForm.getSubmitBtn();
        registerForm = new AppRegisterForm();
        saveBtn = registerForm.getSaveBtn();
        recoveryForm = new AppRecoveryForm();

    }

    public void setAppUI() {
        titleLabel.setUI(Font.TITLE_FONT, Color.SECONDARY, Color.TRITIARY);
        loginBtn.setUI(Font.MEDIUM_FONT, Color.TRITIARY, Color.WHITE);
        registerBtn.setUI(Font.MEDIUM_FONT, Color.TRITIARY, Color.WHITE);
        recoveryBtn.setUI(Font.SMALL_FONT, Color.WHITE, Color.BLACK);
        
        loginBtn.setButtonSize(150, 50);
        registerBtn.setButtonSize(150, 50);
    }
    private void setAppConstraints() {
        var gc = new java.awt.GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.insets = new Insets(10, 5, 20, 5);
        add(titleLabel, gc);
        gc.gridx = 0;
        gc.gridy++;
        gc.insets = new Insets(20, 5, 10, 5);
        add(loginBtn, gc);
        gc.gridx = 0;
        gc.gridy++;
        gc.insets = new Insets(10, 5, 10, 5);
        add(registerBtn, gc);
        gc.gridy++;
        gc.insets = new Insets(10, 5, 10, 5);
        add(recoveryBtn, gc);

    }
    public void setAuthenticate(AppForm app, ArrayList<UserModel> database) {
        this.database = database;
        loginBtn.addAction(e -> loginBtnAction());
        registerBtn.addAction(e -> registerBtnAction());
        recoveryBtn.addAction(e -> recoveryBtnAction());
        submitBtn.addAction(e -> submitBtnAction(app));
        saveBtn.addAction(e -> saveBtnAction());
    }

    private void loginBtnAction() {
        loginForm.showAppForm();
        hideAppForm();
    }
    private void registerBtnAction() {
        //need user data here
        registerForm.showAppForm();
        hideAppForm();
    }
    private void recoveryBtnAction() {
        //need user data here
        recoveryForm.showAppForm();
        this.hideAppForm();
    }
    private void submitBtnAction(AppForm app) {
        //need user data here
        loginForm.hideAppForm();
        app.showAppForm();
    }
    private void saveBtnAction() {
        //need user data here
        javax.swing.JOptionPane.showMessageDialog(null, str.AUTH[4]);
        registerForm.hideAppForm();
        showAppForm();
    }
}
