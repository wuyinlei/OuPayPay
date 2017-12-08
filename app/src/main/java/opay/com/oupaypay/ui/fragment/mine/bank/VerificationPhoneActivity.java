package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.utils.EnterClass;

/**
 * Created by wuyinlei on 2017/11/26.
 *
 * @funcition 验证手机号
 */

public class VerificationPhoneActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private TextView mTvTip;

    private EditText mEditCode;
    private TextView mGetCode;
    private TextView mTvNotGetCode;
    private TextView mTvNext;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mGetCode.setOnClickListener(this);
        mTvNotGetCode.setOnClickListener(this);
        mTvNext.setOnClickListener(this);

    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mTvTip = (TextView) findViewById(R.id.tv_tip);
        mEditCode = (EditText) findViewById(R.id.et_code);
        mGetCode = (TextView) findViewById(R.id.tv_get_code);
        mTvNotGetCode = (TextView) findViewById(R.id.tv_cannot_code);
        mTvNext = (TextView) findViewById(R.id.tv_next);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_verification_phone;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:

                finish();

                break;


            case R.id.tv_next:
                EnterClass.enterVeriCodeSuccess(VerificationPhoneActivity.this);
                finish();
                break;

            case R.id.tv_get_code:
                Toast.makeText(this, "获取验证码", Toast.LENGTH_SHORT).show();
                break;

            case R.id.tv_cannot_code:
                Toast.makeText(this, "收不到验证码", Toast.LENGTH_SHORT).show();
                break;

            default:

                break;

        }
    }
}
