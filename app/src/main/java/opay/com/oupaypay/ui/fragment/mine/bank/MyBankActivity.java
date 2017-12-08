package opay.com.oupaypay.ui.fragment.mine.bank;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.utils.EnterClass;

public class MyBankActivity extends BaseActivity implements View.OnClickListener {
    private ImageView mIvCode;
    private ImageView mIvBack;
    private TextView mTvBack;
    private ImageView mIvAdd;
    private RecyclerView mRvLayout;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mIvAdd.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvCode = (ImageView) findViewById(R.id.iv_code);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mIvAdd = (ImageView) findViewById(R.id.iv_add);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_bank;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:
                finish();
                break;

            case R.id.iv_add:
                EnterClass.enterAddBank(MyBankActivity.this);
                break;

            default:

                break;

        }
    }
}
