package opay.com.oupaypay.ui.fragment.home.collect;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.utils.tools.RxBarCode;
import opay.com.oupaypay.utils.tools.RxQRCode;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 收款界面
 */

public class CollectMoneyActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private ImageView mIvMore;
    private ImageView mIvTiaoXingMa, mIvErWeiMa;

    private LinearLayout mLlPayFukuan, mLlSaoMafu;

    @Override
    protected void initData() {
        //条形码生成方式一  推荐此方法
        RxBarCode.builder("111122331").
                backColor(getResources().getColor(R.color.transparent)).
                codeColor(getResources().getColor(R.color.black)).
                codeWidth(1000).
                codeHeight(300).
                into(mIvTiaoXingMa);

        RxQRCode.createQRCode("欧佩支付", mIvErWeiMa);

    }

    @Override
    protected void initListener() {
        mTvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mIvMore.setOnClickListener(this);
        mLlPayFukuan.setOnClickListener(this);
        mLlSaoMafu.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mIvMore = (ImageView) findViewById(R.id.iv_more);
        mIvTiaoXingMa = (ImageView) findViewById(R.id.iv_tiaoxingma);
        mIvErWeiMa = (ImageView) findViewById(R.id.iv_erweima);
        mLlPayFukuan = (LinearLayout) findViewById(R.id.ll_pay_fukuan);
        mLlSaoMafu = (LinearLayout) findViewById(R.id.ll_saomafu);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_collect_money;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_back_title:
            case R.id.iv_back:
                finish();
                break;

            case R.id.iv_more:

                break;

            case R.id.ll_pay_fukuan:

                break;

            case R.id.ll_saomafu:

                break;

            default:

                break;
        }
    }
}
