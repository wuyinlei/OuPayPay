package opay.com.oupaypay.ui.fragment.mine;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseFragment;
import opay.com.oupaypay.utils.EnterClass;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 个人中心界面
 */

public class MineFragment extends BaseFragment implements View.OnClickListener {

    private ImageView mIvProfile;
    private TextView mTvNickName;
    private TextView mTvEmail;

    private RelativeLayout mReMine;
    private RelativeLayout mReMyBank;
    private RelativeLayout mReMyCode;
    private RelativeLayout mReMyCollect;
    private RelativeLayout mReMyMessage;
    private RelativeLayout mReMyCustomerService;

    @Override
    protected void initListener() {
        mReMine.setOnClickListener(this);
        mReMyBank.setOnClickListener(this);
        mReMyCode.setOnClickListener(this);
        mReMyCollect.setOnClickListener(this);
        mReMyMessage.setOnClickListener(this);
        mReMyCustomerService.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onBindView(Bundle savedInstanceState, View rootView) {
        mIvProfile = (ImageView) rootView.findViewById(R.id.iv_profile);
        mTvNickName = (TextView) rootView.findViewById(R.id.tv_nickname);
        mTvEmail = (TextView) rootView.findViewById(R.id.tv_email);
        mReMine = (RelativeLayout) rootView.findViewById(R.id.re_mine);
        mReMyBank = (RelativeLayout) rootView.findViewById(R.id.re_my_bank);
        mReMyCode = (RelativeLayout) rootView.findViewById(R.id.re_my_code);
        mReMyCollect = (RelativeLayout) rootView.findViewById(R.id.re_my_collect);
        mReMyMessage = (RelativeLayout) rootView.findViewById(R.id.re_my_message);
        mReMyCustomerService = (RelativeLayout) rootView.findViewById(R.id.re_my_customer_service);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.re_mine:
                EnterClass.enterProfile(getContext());
                break;
            case R.id.re_my_bank:
                EnterClass.enterMyBankActivity(getContext(), "");
                break;
            case R.id.re_my_code:
                EnterClass.enterMyCodeActivity(getContext(), "");
                break;
            case R.id.re_my_collect:
                EnterClass.enterMyCollectActivity(getContext(), "");
                break;
            case R.id.re_my_message:
                EnterClass.enterMyMessageActivity(getContext(), "");
                break;
            case R.id.re_my_customer_service:
                EnterClass.enterMyCustomerServiceActivity(getContext(), "");
                break;

            default:

                break;

        }
    }
}
