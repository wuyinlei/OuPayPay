package opay.com.oupaypay.ui.fragment.mine.code;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/25.
 */

public class MyCodeActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvCode;
    private ImageView mIvBack;
    private TextView mTvBack;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvCode = (ImageView) findViewById(R.id.iv_code);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_code;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:


                break;

        }
    }
}
