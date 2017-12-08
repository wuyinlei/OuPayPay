package opay.com.oupaypay.ui.fragment.mine.bank;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/25.
 *
 * @funcition 我的资产
 */

public class MyAssetsActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;

    private ImageView mIvProfile;
    private TextView mTvNickName;
    private TextView mTvRealName;
    private TextView mTvAllAccount;

    private TextView mTvYuer,
            mTvHongBao,
            mTvJiFen,
            mTvYesInCome,
            mTvJiFenNum,
            mTvHongBaoNum,
            mTvZhuanRuNum,
            mTvZhuanChuNum;


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
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mIvProfile = (ImageView) findViewById(R.id.iv_profile);
        mTvRealName = (TextView) findViewById(R.id.tv_nickname);
        mTvAllAccount = (TextView) findViewById(R.id.tv_all_account);
        mTvYuer = (TextView) findViewById(R.id.tv_yuer);
        mTvHongBao = (TextView) findViewById(R.id.tv_hongbao);
        mTvJiFen = (TextView) findViewById(R.id.tv_jifen);
        mTvYesInCome = (TextView) findViewById(R.id.tv_yes_income);
        mTvJiFenNum = (TextView) findViewById(R.id.tv_jifen_num);
        mTvHongBaoNum = (TextView) findViewById(R.id.tv_hongbao_num);
        mTvZhuanRuNum = (TextView) findViewById(R.id.tv_zhuanru_num);
        mTvZhuanChuNum = (TextView) findViewById(R.id.tv_zhuanchu_num);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_assets;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:


                break;


            case R.id.tv_next:

                break;

            default:

                break;

        }
    }
}
