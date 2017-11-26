package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/26.
 *
 * @funcition 我的余额界面
 */

public class MyBlanceActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private TextView mTvDetail;

    private TextView mTvBlanceNum; //余额
    private RelativeLayout mReRecharge;
    private RelativeLayout mReWithdrawals;

    private TextView mTvOpay;  //欧佩钱包
    private TextView mTvCommenProblem;  //常见问题

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mTvDetail.setOnClickListener(this);
        mReRecharge.setOnClickListener(this);
        mTvOpay.setOnClickListener(this);
        mTvCommenProblem.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvDetail = (TextView) findViewById(R.id.iv_blance_detailed);
        mTvBlanceNum = (TextView) findViewById(R.id.tv_my_blance);
        mReRecharge = (RelativeLayout) findViewById(R.id.re_my_recharge);
        mReWithdrawals = (RelativeLayout) findViewById(R.id.re_my_withdrawals);
        mTvOpay = (TextView) findViewById(R.id.tv_opay_walet);
        mTvCommenProblem = (TextView) findViewById(R.id.tv_common_problem);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_blance;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:

                finish();

                break;

            case R.id.iv_blance_detailed:

                break;

            case R.id.re_my_recharge:

                break;

            case R.id.re_my_withdrawals:

                break;

            case R.id.tv_opay_walet:

                break;

            case R.id.tv_common_problem:

                break;

            default:

                break;

        }
    }
}
