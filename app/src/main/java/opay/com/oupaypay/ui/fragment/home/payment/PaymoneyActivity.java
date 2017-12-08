package opay.com.oupaypay.ui.fragment.home.payment;

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
 * @funcition 付款界面
 */

public class PaymoneyActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mIvBack;
    private TextView mTvBack;
    private TextView mTvBlum;

    private ImageView mIvTiaoXingMa,mIvErWeiMa;
    private LinearLayout mLlYuer,mLlPaySelect;

    @Override
    protected void initData() {
        //条形码生成方式一  推荐此方法
        RxBarCode.builder("111122331").
                backColor(getResources().getColor(R.color.transparent)).
                codeColor(getResources().getColor(R.color.black)).
                codeWidth(1000).
                codeHeight(300).
                into(mIvTiaoXingMa);

        RxQRCode.createQRCode("欧佩支付",mIvErWeiMa);
    }

    @Override
    protected void initListener() {
        mTvBack.setOnClickListener(this);
        mTvBack.setOnClickListener(this);
        mTvBlum.setOnClickListener(this);
        mLlYuer.setOnClickListener(this);
        mLlPaySelect.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        mTvBlum = (TextView) findViewById(R.id.tv_blum);
        mIvTiaoXingMa = (ImageView) findViewById(R.id.iv_tiaoxingma);
        mIvErWeiMa = (ImageView) findViewById(R.id.iv_erweima);
        mLlYuer = (LinearLayout) findViewById(R.id.ll_yuer);
        mLlPaySelect = (LinearLayout) findViewById(R.id.ll_pay_select);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_paymoney;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_back_title:
            case R.id.iv_back:
                finish();
                break;

            case R.id.tv_blum:
                //相册
                break;

            case R.id.ll_yuer:

                break;

            case R.id.ll_pay_select:

                break;



            default:

                break;
        }
    }
}
