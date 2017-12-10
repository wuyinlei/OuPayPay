package opay.com.oupaypay.ui.activity;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.ui.fragment.bills.BillsFragment;
import opay.com.oupaypay.ui.fragment.friend.FriendFragment;
import opay.com.oupaypay.ui.fragment.home.HomeFragment;
import opay.com.oupaypay.ui.fragment.mine.MineFragment;
import opay.com.oupaypay.widget.FragmentTabHost;


public class MainActivity extends BaseActivity {

    private long EXIT_FLAG = 0;

    //底部tab
    private List<Tab> mTabs = new ArrayList<>(4);
    private FragmentTabHost mTabHost;
    private ImageView img;  //底部图片
    private TextView text;  //底部标题
    private LayoutInflater mInflater;


    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    /**
     * 初始化底部的几个菜单栏
     */
    private void initTab() {
        Tab home = new Tab(R.string.title_home, R.mipmap.tebbar_home_nopoint, HomeFragment.class);
        Tab bills = new Tab(R.string.title_bank, R.mipmap.tebbar_bill_nopoint, BillsFragment.class);
        Tab friend = new Tab(R.string.title_friend, R.mipmap.tebbar__friend_nopoint, FriendFragment.class);
        Tab mine = new Tab(R.string.title_mine, R.mipmap.tebbar__mine_nopoint, MineFragment.class);

        mTabs.add(home);
        mTabs.add(bills);
        mTabs.add(friend);
        mTabs.add(mine);

        mInflater = LayoutInflater.from(this);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        int i = -1;

        for (Tab tab : mTabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(builderIndiator(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null, ++i);
        }

        //去掉分割线
        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        //设置初始显示的是第几个tab
        mTabHost.setCurrentTab(0);

    }


    /**
     * 创建indiator
     *
     * @param tab tab
     * @return view
     */
    private View builderIndiator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);

        img = (ImageView) view.findViewById(R.id.icon_tab);
        text = (TextView) view.findViewById(R.id.text_indicator);
        img.setBackgroundResource(tab.getImage());
        text.setText(tab.getTitle());

        return view;
    }





    @Override
    protected void initView() {
        initTab();

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (KeyEvent.KEYCODE_BACK == keyCode) {

            if ((System.currentTimeMillis() - EXIT_FLAG) > 2000) {
                EXIT_FLAG = System.currentTimeMillis();
                Toast.makeText(this, getString(R.string.app_name), Toast.LENGTH_SHORT).show();
            } else {

                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
