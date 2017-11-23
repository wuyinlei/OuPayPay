package opay.com.oupaypay.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import opay.com.oupaypay.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView();

        initListener();

        initData();
    }


    protected abstract void initData();

    protected abstract void initListener();

    protected abstract void initView();


    protected abstract int getLayoutId();


}
