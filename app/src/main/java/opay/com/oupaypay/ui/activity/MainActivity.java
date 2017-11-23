package opay.com.oupaypay.ui.activity;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;
import opay.com.oupaypay.ui.fragment.bills.BillsFragment;
import opay.com.oupaypay.ui.fragment.friend.FriendFragment;
import opay.com.oupaypay.ui.fragment.home.HomeFragment;
import opay.com.oupaypay.ui.fragment.mine.MineFragment;


public class MainActivity extends BaseActivity {

    LinearLayoutCompat mBottomBar = null;
    public BottomNavigationView mNavigationView;

    public MenuItem mMenuItem;

    public ViewPager mViewPager;
    private long EXIT_FLAG = 0;


    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {

        mNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        BottomNavigationViewHelper.disableShiftMode(mNavigationView);

        navigationViewSetting(mNavigationView);

        viewPagerSetting(mViewPager);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    /**
     * 设置和ViewPager进行联动
     *
     * @param viewPager viewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        BottomViewPagerAdapter adapter = new BottomViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new BillsFragment());
        adapter.addFragment(new FriendFragment());
        adapter.addFragment(new MineFragment());
        viewPager.setAdapter(adapter);
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


    @SuppressLint("ClickableViewAccessibility")
    private void viewPagerSetting(ViewPager viewPager) {

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (mMenuItem != null) {
                    mMenuItem.setChecked(false);
                } else {
                    mNavigationView.getMenu().getItem(0).setChecked(false);
                }
                mMenuItem = mNavigationView.getMenu().getItem(position);
                mMenuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        //禁止ViewPager滑动
        mViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });


        setupViewPager(viewPager);

    }

    private void navigationViewSetting(BottomNavigationView navigationView) {
        navigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                mViewPager.setCurrentItem(0);
                                break;
                            case R.id.navigation_dashboard:
                                mViewPager.setCurrentItem(1);
                                break;
                            case R.id.navigation_video:
                                mViewPager.setCurrentItem(2);
                                break;
                            case R.id.navigation_cart:
                                mViewPager.setCurrentItem(3);
                                break;
                        }
                        return false;
                    }
                });

    }
}
