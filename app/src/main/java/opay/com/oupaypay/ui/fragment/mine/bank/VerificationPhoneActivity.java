package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

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

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mGetCode.setOnClickListener(this);
        mTvNotGetCode.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvTip = (TextView) findViewById(R.id.tv_tip);
        mEditCode = (EditText) findViewById(R.id.et_code);
        mGetCode = (TextView) findViewById(R.id.tv_get_code);
        mTvNotGetCode = (TextView) findViewById(R.id.tv_cannot_code);
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

            case R.id.iv_detail:

                break;

            case R.id.tv_next:

                break;

            case R.id.tv_get_code:

                break;

            case R.id.tv_cannot_code:

                break;

            default:

                break;

        }
    }
}
