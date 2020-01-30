package com.alfazteremere.ui.mobilelogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.alfazteremere.R;
import com.alfazteremere.databinding.ActivityMobileLoginBinding;
import com.alfazteremere.ui.login.LoginActivityPresenter;

public class MobileLoginActivity extends AppCompatActivity implements MobileLoginActivityContract.view {
    MobileLoginActivityPresenter mobileLoginActivityPresenter;
    ActivityMobileLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mobile_login);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mobile_login);
        mobileLoginActivityPresenter = new MobileLoginActivityPresenter(this);
        binding.setMobileLoginPresenter(mobileLoginActivityPresenter);
    }

    @Override
    public void toastMobile(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
