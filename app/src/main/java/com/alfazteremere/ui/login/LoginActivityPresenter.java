package com.alfazteremere.ui.login;

import android.view.View;

public class LoginActivityPresenter implements LoginActivityContract.presenter {
    private LoginActivityContract.view loginActivityContractView;
    private LoginActivityModel loginActivityModel;

    public LoginActivityPresenter(LoginActivityContract.view loginActivityContractView) {
        this.loginActivityContractView = loginActivityContractView;
        loginActivityModel = new LoginActivityModel();
    }

    @Override
    public void postLogin(View view) {
        loginActivityContractView.showToast();
    }

    @Override
    public void mobileLogin(View view) {
        loginActivityContractView.openMobileLogin();
    }
}
