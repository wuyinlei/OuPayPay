package opay.com.oupaypay.ui.account.register;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/12/4.
 *
 * @funcition 注册界面
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private EditText mEditName,mEditPass,mEditConfirmPass;
    private TextView mTvLogin,mTvRegister;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mTvLogin.setOnClickListener(this);
        mTvRegister.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mEditName = (EditText) findViewById(R.id.edit_name);
        mEditPass = (EditText) findViewById(R.id.edit_password);
        mEditConfirmPass = (EditText) findViewById(R.id.edit_confirm_password);
        mTvLogin = (TextView) findViewById(R.id.tv_login);
        mTvRegister = (TextView) findViewById(R.id.tv_register);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_login:

                break;

            case R.id.tv_register:

                break;


            default:

                break;



        }
    }
}
