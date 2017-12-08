package opay.com.oupaypay.ui.fragment.home.discount;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/12/8.
 *
 * @funcition 优惠卡圈界面
 */

public class DiscountSummaryActivity extends BaseActivity {

    private TextView mTvBack;
    private ImageView mIvBack;

    private RecyclerView re_nearbyre_view;
    private NeaybyDiscountAdapter mDiscountAdapter;
    private WebView mWebView;

    @Override
    protected void initData() {
        re_nearbyre_view.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mDiscountAdapter = new NeaybyDiscountAdapter();
        re_nearbyre_view.setAdapter(mDiscountAdapter);
    }

    @Override
    protected void initListener() {
        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void initView() {
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mTvBack = (TextView) findViewById(R.id.tv_back_title);
        re_nearbyre_view= (RecyclerView) findViewById(R.id.re_nearbyre_view);
        mWebView = (WebView) findViewById(R.id.web_view);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_discount_summary;
    }
}
