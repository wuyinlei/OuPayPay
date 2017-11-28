package opay.com.oupaypay.ui.fragment.friend.redmoney;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/11/28.
 *
 * @funcition 发红包界面
 */

public class RedMoneyActivity extends BaseActivity implements View.OnClickListener {

    private TextView mTvBackTitle;
    private EditText mEditYuan;  //红包金额
    private EditText mEditBlessing;  //祝福语
    private TextView mTvMoneyCount;  //红包金额
    private TextView mTvPayRed;  //发红包
    private TextView mTvPayType;//支付方式
    private TextView mTvPaySelect; //更换支付方式

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mTvBackTitle.setOnClickListener(this);
        mTvPayRed.setOnClickListener(this);
        mTvPaySelect.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mTvBackTitle = (TextView) findViewById(R.id.tv_back_title);
        mEditYuan = (EditText) findViewById(R.id.edit_yuan);
        mEditBlessing = (EditText) findViewById(R.id.edit_blessing);
        mTvMoneyCount = (TextView) findViewById(R.id.tv_money_count);
        mTvPayRed = (TextView) findViewById(R.id.tv_pay_red);
        mTvPayType = (TextView) findViewById(R.id.tv_pay_type);
        mTvPaySelect = (TextView) findViewById(R.id.tv_pay_select);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_red_money;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_back_title:
                finish();

                break;

            case R.id.tv_pay_red:

                break;

            case R.id.tv_pay_select:

                break;

            default:

                break;
        }
    }
}
