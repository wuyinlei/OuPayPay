package opay.com.oupaypay.ui.account.login;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.utils.EnterClass;

/**
 * Created by wuyinlei on 2017/12/4.
 *
 * @funcition 登录界面
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText mEditName,mEditPass;
    private TextView mTvForgetPass,mTvLogin,mTvRegister;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mTvLogin.setOnClickListener(this);
        mTvRegister.setOnClickListener(this);
        mTvForgetPass.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mEditName = (EditText) findViewById(R.id.edit_name);
        mEditPass = (EditText) findViewById(R.id.edit_password);
        mTvForgetPass = (TextView) findViewById(R.id.tv_forget_pass);
        mTvLogin = (TextView) findViewById(R.id.tv_login);
        mTvRegister = (TextView) findViewById(R.id.tv_register);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login:
                EnterClass.enterMain(LoginActivity.this);
                break;

            case R.id.tv_register:
                EnterClass.enterRegister(LoginActivity.this);
                finish();
                break;

            case R.id.tv_forget_pass:
                EnterClass.enterForgetPass(LoginActivity.this);
                break;

            default:

                break;



        }
    }
}
