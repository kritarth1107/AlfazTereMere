package com.alfazteremere.ui.mobilelogin;

import android.view.View;

public class MobileLoginActivityPresenter implements MobileLoginActivityContract.presenter {
    MobileLoginActivityContract.view mobileLoginActivityView;
    MobileLoginActivityModel mobileLoginActivityModel;

    public MobileLoginActivityPresenter(MobileLoginActivityContract.view mobileLoginActivityView) {
        this.mobileLoginActivityView = mobileLoginActivityView;
        mobileLoginActivityModel = new MobileLoginActivityModel();
    }

    @Override
    public void loginButtonClick(View view) {

        mobileLoginActivityView.toastMobile(mobileLoginActivityModel.mobile);
    }
}
