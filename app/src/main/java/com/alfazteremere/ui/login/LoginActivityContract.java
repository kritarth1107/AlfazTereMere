package com.alfazteremere.ui.login;

import android.view.View;

public interface LoginActivityContract {
    interface  view{
        public void showToast();
        public void openMobileLogin();
    }
    interface presenter{
        public void postLogin(View view);
        public void mobileLogin(View view);
    }
}
