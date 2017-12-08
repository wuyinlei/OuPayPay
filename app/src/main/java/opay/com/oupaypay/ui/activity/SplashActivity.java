package opay.com.oupaypay.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.opay.OPay;
import opay.com.oupaypay.utils.EnterClass;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        OPay.getHandler().postDelayed(new Runnable() {
            @Override
            public void run() {
                EnterClass.enterRegister(SplashActivity.this);
                SplashActivity.this.finish();
            }
        },2000);
    }
}
