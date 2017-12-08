package opay.com.oupaypay.app.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

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
