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

    private RecyclerView myRecyclerView;

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

        collapsingToolbarLayout = (CollapsingToolbarLayout) rootView.findViewById(R.id.home_toolbar_layout);
        collapsingToolbarLayout.setStatusBarScrimColor(getResources().getColor(R.color.home_title1_color));
        mAppBarLayout=(AppBarLayout)rootView.findViewById(R.id.home_fragment_appbar);

        mToolbar1 = (View) rootView.findViewById(R.id.home_fragment_toolbar1);
        mToolbar2 = (View) rootView.findViewById(R.id.home_fragment_toolbar2);

        head1_srarchimg = (ImageView) rootView.findViewById(R.id.toolbar_head1_serachicon);
        head1_Search_Et = (EditText) rootView.findViewById(R.id.toolbar_head1_serach);
        head1_Contract = (ImageView) rootView.findViewById(R.id.toolbar_head1_contract);
        head1_add = (ImageView) rootView.findViewById(R.id.toolbar_head1_add);

        head2_scan = (ImageView) rootView.findViewById(R.id.toolbar_head2_scan);
        head2_Pay = (ImageView) rootView.findViewById(R.id.toolbar_head2_pay);
        head2_rec = (ImageView) rootView.findViewById(R.id.toolbar_head2_receive);
        head2_add = (ImageView) rootView.findViewById(R.id.toolbar_head2_add);


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
