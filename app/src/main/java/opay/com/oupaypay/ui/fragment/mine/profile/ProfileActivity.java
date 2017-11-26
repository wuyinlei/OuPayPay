package opay.com.oupaypay.ui.fragment.mine.profile;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 我的主页
 */

public class ProfileActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;

    private ImageView mIvProfile;
    private TextView mTvNickName;
    private TextView mTvDesc;
    private TextView mTvAccount;

    private TextView mTvName;
    private ImageView mIvAuthen;

    private RelativeLayout mReMyBank;
    private TextView mTvBankNum;

    private RelativeLayout mReMyCode;
    private RelativeLayout mReMyAssets;

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mIvProfile.setOnClickListener(this);
        mReMyBank.setOnClickListener(this);
        mReMyCode.setOnClickListener(this);
        mReMyAssets.setOnClickListener(this);

    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mIvProfile = (ImageView) findViewById(R.id.iv_profile);
        mTvNickName = (TextView) findViewById(R.id.tv_nickname);
        mTvDesc = (TextView) findViewById(R.id.tv_desc);
        mTvAccount = (TextView) findViewById(R.id.tv_account);
        mTvName = (TextView) findViewById(R.id.tv_name);
        mIvAuthen = (ImageView) findViewById(R.id.iv_authen);
        mReMyBank = (RelativeLayout) findViewById(R.id.re_my_bank);
        mTvBankNum = (TextView) findViewById(R.id.tv_bank_num);
        mReMyCode = (RelativeLayout) findViewById(R.id.re_my_code);
        mReMyAssets = (RelativeLayout) findViewById(R.id.re_my_assets);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:


                break;

            case R.id.iv_profile:


                break;

            case R.id.re_my_bank:


                break;

            case R.id.re_my_code:


                break;

            case R.id.re_my_assets:


                break;


            default:

                break;
        }
    }
}
