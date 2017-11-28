package opay.com.oupaypay.ui.fragment.friend.frienthome;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/28.
 *
 * @funcition 朋友首页界面
 */

public class FriendHomeActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvProfileBeijing;
    private ImageView mIvBack;
    private TextView mTvBackTitle;
    private ImageView mIvProfile;
    private TextView mTvNickName;
    private TextView mTvDesc;
    private TextView mTvTransfer;
    private TextView mTvRedEnvelopes;
    private TextView mTvAccount;
    private TextView mTvRealName;
    private RelativeLayout mReMyBeizhu;


    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(this);
        mTvBackTitle.setOnClickListener(this);
        mTvTransfer.setOnClickListener(this);
        mTvRedEnvelopes.setOnClickListener(this);
        mReMyBeizhu.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvProfileBeijing = (ImageView) findViewById(R.id.iv_profile_beijing);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBackTitle = (TextView) findViewById(R.id.tv_back_title);
        mIvProfile = (ImageView) findViewById(R.id.iv_profile);
        mTvNickName = (TextView) findViewById(R.id.tv_nickname);
        mTvDesc = (TextView) findViewById(R.id.tv_desc);
        mTvTransfer = (TextView) findViewById(R.id.tv_transfer);
        mTvRedEnvelopes = (TextView) findViewById(R.id.tv_red_envelopes);
        mTvAccount = (TextView) findViewById(R.id.tv_account);
        mTvRealName = (TextView) findViewById(R.id.tv_name);
        mReMyBeizhu = (RelativeLayout) findViewById(R.id.re_my_beizhu);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_friend_home;
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
            case R.id.tv_back_title:
                finish();
                break;

            case R.id.tv_transfer:
                // TODO: 2017/11/28 转账
                break;

            case R.id.tv_red_envelopes:
                // TODO: 2017/11/28 发红包
                break;

            case R.id.re_my_beizhu:
                // TODO: 2017/11/28 备注信息
                break;

            default:
                break;
        }
    }
}
