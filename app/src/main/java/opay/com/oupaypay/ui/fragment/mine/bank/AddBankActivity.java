package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/25.
 */

public class AddBankActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private ImageView mIvAddDetail;

    private TextView mTvNext;

    private EditText mEdBankName;
    private EditText mEdBankCode;


    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mIvAddDetail.setOnClickListener(this);
        mTvNext.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvAddDetail = (ImageView) findViewById(R.id.iv_detail);
        mTvNext = (TextView) findViewById(R.id.tv_next);
        mEdBankName = (EditText) findViewById(R.id.et_bank_name);
        mEdBankCode = (EditText) findViewById(R.id.et_bank_code);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_my_bank;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:


                break;

            case R.id.iv_detail:

                break;

            case R.id.tv_next:

                break;

            default:

                break;

        }
    }
}
