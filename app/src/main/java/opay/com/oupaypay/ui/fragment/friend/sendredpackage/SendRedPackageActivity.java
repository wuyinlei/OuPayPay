package opay.com.oupaypay.ui.fragment.friend.sendredpackage;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import rx.functions.Action1;
/**
 * Created by wuyinlei on 2017/11/28.
 */

public class SendRedPackageActivity extends BaseActivity implements View.OnClickListener {
    private AppBarLayout billsFragmentAppbar;
    private LinearLayout secondPageBack;
    private TextView billsFragmentSelect;
    private TextView billsFragmentTitle;
    private RelativeLayout sendRedPackageView;
    private ImageView sendRedPackageStatusImg;
    private TextView sendRedPackageStatusText;
    private TextView sendRedPackageMoneyStatus;
    private TextView sendRedPackageMoneyNum;
    private Button sendRedPackageSendDone;
    private ImageView sendRedPackageSendAd;
    private CollapsingToolbarLayout redToolbarLayout;



    @Override
    protected void initData() {
//需要设置 钱数
        sendRedPackageMoneyNum.setText("000");
        sendRedPackageMoneyStatus.setText("谁给谁转账");
        sendRedPackageStatusText.setText("success");
        sendRedPackageStatusImg.setImageResource(000);


    }

    @Override
    protected void initListener() {
        RxView.clicks(sendRedPackageSendAd).throttleFirst(1000, TimeUnit.MILLISECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {

            }
        });
        RxView.clicks(sendRedPackageSendDone).throttleFirst(1000, TimeUnit.MILLISECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {

            }
        });
        secondPageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initView() {
        billsFragmentAppbar = (AppBarLayout) findViewById(R.id.bills_fragment_appbar);
        secondPageBack = (LinearLayout) findViewById(R.id.second_page_back);
        billsFragmentSelect = (TextView) findViewById(R.id.bills_fragment_select);
        billsFragmentTitle = (TextView) findViewById(R.id.bills_fragment_title);
        sendRedPackageView = (RelativeLayout) findViewById(R.id.send_red_package_view);
        sendRedPackageStatusImg = (ImageView) findViewById(R.id.send_red_package_status_img);
        sendRedPackageStatusText = (TextView) findViewById(R.id.send_red_package_status_text);
        sendRedPackageMoneyStatus = (TextView) findViewById(R.id.send_red_package_money_status);
        sendRedPackageMoneyNum = (TextView) findViewById(R.id.send_red_package_money_num);
        sendRedPackageSendDone = (Button) findViewById(R.id.send_red_package_send_done);
        sendRedPackageSendAd = (ImageView) findViewById(R.id.send_red_package_send_ad);//广告
        redToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.red_toolbar_layout);
        redToolbarLayout.setStatusBarScrimColor(getResources().getColor(R.color.white));


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_send_red_package;
    }


    @Override
    public void onClick(View v) {

    }
}
