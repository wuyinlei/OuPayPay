package opay.com.oupaypay.ui.fragment.friend.receiveredpackage;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jakewharton.rxbinding.view.RxView;

import java.util.concurrent.TimeUnit;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import rx.functions.Action1;

public class ReceiveRedPackageActivity extends BaseActivity {
    private AppBarLayout receiveRedAppbar;
    private CollapsingToolbarLayout redToolbarLayout;

    private LinearLayout secondPageBack;
    private TextView receiveRedBack;
    private TextView receiveRedTitle;
    private RelativeLayout receiveRedPackageView;
    private ImageView receiveRedPackageStatusImg;
    private TextView receiveRedPackageStatusText;
    private TextView receiveRedPackageMoneyStatus;
    private LinearLayout redNumView;
    private TextView receiveRedPackageMoneyNum;
    private TextView receiveRedStatus;
    private TextView receiveRedHistory;
    private TextView receiveRedMun;


    @Override
    protected void initData() {

        receiveRedPackageStatusImg.setImageResource(00);//headpic
        receiveRedPackageStatusText.setText("Name");
        receiveRedPackageMoneyStatus.setText("恭喜发财，万事如意！");
        receiveRedPackageMoneyNum.setText("100.00");
        receiveRedStatus.setText("接收成功");
        receiveRedMun.setText("红包编号：1234567890098765431");

    }

    @Override
    protected void initListener() {
        secondPageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        RxView.clicks(receiveRedHistory).throttleFirst(1000, TimeUnit.MILLISECONDS).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {

            }
        });


    }

    @Override
    protected void initView() {
        receiveRedAppbar = (AppBarLayout) findViewById(R.id.receive_red_appbar);
        redToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.red_toolbar_layout);
        secondPageBack = (LinearLayout) findViewById(R.id.second_page_back);
        receiveRedBack = (TextView) findViewById(R.id.receive_red_back);
        receiveRedTitle = (TextView) findViewById(R.id.receive_red_title);
        receiveRedPackageView = (RelativeLayout) findViewById(R.id.receive_red_package_view);
        receiveRedPackageStatusImg = (ImageView) findViewById(R.id.receive_red_package_status_img);
        receiveRedPackageStatusText = (TextView) findViewById(R.id.receive_red_package_status_text);
        receiveRedPackageMoneyStatus = (TextView) findViewById(R.id.receive_red_package_money_status);
        redNumView = (LinearLayout) findViewById(R.id.red_num_view);
        receiveRedPackageMoneyNum = (TextView) findViewById(R.id.receive_red_package_money_num);
        receiveRedStatus = (TextView) findViewById(R.id.receive_red_status);
        receiveRedHistory = (TextView) findViewById(R.id.receive_red_history);
        receiveRedMun = (TextView) findViewById(R.id.receive_red_mun);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_receive_red_package;
    }
}
