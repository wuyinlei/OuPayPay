package opay.com.oupaypay.ui.fragment.home;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseFragment;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 首页
 */

public class HomeFragment extends BaseFragment {

    private AppBarLayout mAppBarLayout = null;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private View mToolbar1 = null;
    private View mToolbar2 = null;

    private ImageView head1_add = null;
    private EditText head1_Search_Et = null;
    private ImageView head1_Contract = null;
    private ImageView head1_srarchimg = null;

    private ImageView head2_scan = null;
    private ImageView head2_Pay = null;
    private ImageView head2_rec = null;
    private ImageView head2_add = null;

    private RelativeLayout tool1_Scan;
    private RelativeLayout tool1_Pay;
    private RelativeLayout tool1_Rec;
    private RelativeLayout tool1_BankCard;

    private RelativeLayout tool2View;


    //整个头部消息部分,余额,转账功能,助手信息
    private RelativeLayout homeTitle2BlanceView;
    private TextView homeTitle2Count;
    private RelativeLayout homeTransferView;
    private RelativeLayout homePaybackView;
    private RelativeLayout homeCardView;
    private RelativeLayout homeShareView;
    private RelativeLayout homeAssistantView;
    private TextView homeTitle2AssistantMsg1;
    private TextView homeTitle2AssistantMsg2;
    private TextView homeTitle2AssistantMsg1Time;
    private TextView homeTitle2AssistantMsg2Time;

    private RecyclerView myRecyclerView;


    private ArrayList<Object> datas;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onBindView(Bundle savedInstanceState, View rootView) {


        myRecyclerView = (RecyclerView) rootView.findViewById(R.id.home_fragment_recycleview);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        datas = new ArrayList<>();
        myRecyclerView.setAdapter(new HomeRecycleviewAdapter(getActivity(), datas));
        collapsingToolbarLayout = (CollapsingToolbarLayout) rootView.findViewById(R.id.home_toolbar_layout);
        collapsingToolbarLayout.setStatusBarScrimColor(getResources().getColor(R.color.home_title1_color));
        mAppBarLayout = (AppBarLayout) rootView.findViewById(R.id.home_fragment_appbar);

        mToolbar1 = (View) rootView.findViewById(R.id.home_fragment_toolbar1);
        mToolbar2 = (View) rootView.findViewById(R.id.home_fragment_toolbar2);

        head1_srarchimg = (ImageView) rootView.findViewById(R.id.toolbar_head1_serachicon);//展开 搜索图表
        head1_Search_Et = (EditText) rootView.findViewById(R.id.toolbar_head1_serach);//展开 输入框
        head1_Contract = (ImageView) rootView.findViewById(R.id.toolbar_head1_contract);//展开 联系人
        head1_add = (ImageView) rootView.findViewById(R.id.toolbar_head1_add); //展开 加号

        head2_scan = (ImageView) rootView.findViewById(R.id.toolbar_head2_scan);//收起 扫码
        head2_Pay = (ImageView) rootView.findViewById(R.id.toolbar_head2_pay);//收起 付款
        head2_rec = (ImageView) rootView.findViewById(R.id.toolbar_head2_receive);//收起 收到
        head2_add = (ImageView) rootView.findViewById(R.id.toolbar_head2_add);//收起 +


        homeTitle2BlanceView = (RelativeLayout) rootView.findViewById(R.id.home_title2_blance_view);//账户余额view
        homeTitle2Count = (TextView) rootView.findViewById(R.id.home_title2_count);//账户余额
        homeTransferView = (RelativeLayout) rootView.findViewById(R.id.home_transfer_view);//转账
        homePaybackView = (RelativeLayout) rootView.findViewById(R.id.home_payback_view);//还款
        homeCardView = (RelativeLayout) rootView.findViewById(R.id.home_card_view);//卡券
        homeShareView = (RelativeLayout) rootView.findViewById(R.id.home_share_view);//分享
        homeAssistantView = (RelativeLayout) rootView.findViewById(R.id.home_assistant_view); //助手view
        homeTitle2AssistantMsg1 = (TextView) rootView.findViewById(R.id.home_title2_assistant_msg1); //助手信息1
        homeTitle2AssistantMsg2 = (TextView) rootView.findViewById(R.id.home_title2_assistant_msg2);//信息2
        homeTitle2AssistantMsg1Time = (TextView) rootView.findViewById(R.id.home_title2_assistant_msg1_time);//信息1时间
        homeTitle2AssistantMsg2Time = (TextView) rootView.findViewById(R.id.home_title2_assistant_msg2_time);//信息2时间

        //整个新闻+资讯打算做成一个统一的recycleview,以数据改变为分界线。
        //大概为 datas 中数据对象Data为  { news{},info{}} ,=》或者直接合并为,反正数据都差不多 {news{}}



        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset == 0) {
                    //张开
                    mToolbar1.setVisibility(View.VISIBLE);
                    mToolbar2.setVisibility(View.GONE);
                    setToolbar1Alpha(255);
                } else if (Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()) {
                    //收缩
                    mToolbar1.setVisibility(View.GONE);
                    mToolbar2.setVisibility(View.VISIBLE);
                    setToolbar2Alpha(255);
                } else {
                    int alpha = 255 - Math.abs(verticalOffset);
                    if (alpha < 0) {
                        Log.e("alpha", alpha + "");
                        //收缩toolbar
                        mToolbar1.setVisibility(View.GONE);
                        mToolbar2.setVisibility(View.VISIBLE);
                        setToolbar2Alpha(Math.abs(verticalOffset));
                    } else {
                        //张开toolbar
                        mToolbar1.setVisibility(View.VISIBLE);
                        mToolbar2.setVisibility(View.GONE);
                        setToolbar1Alpha(alpha);
                    }
                }
            }
        });
    }

    //设置展开时各控件的透明度
    public void setToolbar1Alpha(int alpha) {
        head1_add.getDrawable().setAlpha(alpha);
//        head1_Search_Et.setTextColor(Color.argb(alpha, 255, 255, 255));
        head1_Search_Et.setTextColor(Color.alpha(alpha));
        head1_srarchimg.getDrawable().setAlpha(alpha);
        head1_Contract.getDrawable().setAlpha(alpha);
    }

    //设置闭合时各控件的透明度
    public void setToolbar2Alpha(int alpha) {
        head2_scan.getDrawable().setAlpha(alpha);
        head2_Pay.getDrawable().setAlpha(alpha);
        head2_rec.getDrawable().setAlpha(alpha);
        head2_add.getDrawable().setAlpha(alpha);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_home;
    }
}
