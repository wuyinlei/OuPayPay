package opay.com.oupaypay.ui.account.update.uppass;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/12/4.
 *
 * @funcition 更新密码界面
 */

public class UpdatePassActivity extends BaseActivity implements View.OnClickListener {


    private EditText mEditBankName;//持卡人姓名
    private EditText mEditPhoneNum; //手机号
    private EditText mEditPhoneCode;  //手机验证码
    private EditText mEditNewPass;  //新密码
    private EditText mEditNewPassAgain;  //再次输入新密码

    private TextView mTvGetCode; //获取手机验证码
    private TextView mTvResetPass;
    private TextView mTvLogin;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mTvResetPass.setOnClickListener(this);
        mTvLogin.setOnClickListener(this);
        mTvGetCode.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mEditBankName = (EditText) findViewById(R.id.edit_bank_name);
        mEditPhoneNum = (EditText) findViewById(R.id.edit_phone_num);
        mEditPhoneCode = (EditText) findViewById(R.id.edit_phone_code);
        mEditNewPass = (EditText) findViewById(R.id.edit_new_pass);
        mEditNewPassAgain = (EditText) findViewById(R.id.edit_new_pass_again);
        mTvGetCode = (TextView) findViewById(R.id.tv_get_code);
        mTvResetPass = (TextView) findViewById(R.id.tv_reset_password);
        mTvLogin = (TextView) findViewById(R.id.tv_login);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_update_password;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_get_code:

                break;


            case R.id.tv_reset_password:

                break;

            case R.id.tv_login:

                break;

            default:

                break;
        }
    }
}
