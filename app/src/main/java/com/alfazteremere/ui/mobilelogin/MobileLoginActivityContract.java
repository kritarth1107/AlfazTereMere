package com.alfazteremere.ui.mobilelogin;

import android.view.View;

public interface MobileLoginActivityContract {
    interface view{
        public void toastMobile(String s);
    }
    interface presenter{
        public void loginButtonClick(View view);
    }
}
