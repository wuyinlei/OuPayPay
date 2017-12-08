package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/26.
 *
 * @funcition 验证码验证成功
 */

public class VeriCodeSuccessActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private TextView mTvSuccess;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mTvSuccess.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mTvSuccess = (TextView) findViewById(R.id.tv_success);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_verification_code_success;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:

                finish();

                break;

            case R.id.tv_success:
                finish();
                // TODO: 2017/12/8 是不是需要回到添加银行卡的界面进行刷新
                break;

            default:

                break;

        }
    }
}
