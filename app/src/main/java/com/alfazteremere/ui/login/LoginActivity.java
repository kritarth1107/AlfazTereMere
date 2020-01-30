package com.alfazteremere.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.alfazteremere.R;
import com.alfazteremere.databinding.ActivityLoginBinding;
import com.alfazteremere.ui.mobilelogin.MobileLoginActivity;

public class LoginActivity extends AppCompatActivity implements LoginActivityContract.view {
    LoginActivityPresenter mPresenter;
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        mPresenter = new LoginActivityPresenter(this);
        binding.setLoginPresenter(mPresenter);
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Google Login Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void openMobileLogin() {
        startActivity(new Intent(this, MobileLoginActivity.class));
    }
}
