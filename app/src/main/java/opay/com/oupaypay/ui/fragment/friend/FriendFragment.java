package opay.com.oupaypay.ui.fragment.friend;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseFragment;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 朋友界面
 */

public class FriendFragment extends BaseFragment {

    private SwipeRefreshLayout fragmentFriendRefresh;
    private StickyListHeadersListView fragmentFriendRecycleview;
    private AppBarLayout friendFragmentAppbar;
    private TextView friendFragmentTitle;
    private ImageView friendFragmentSelect;

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onBindView(Bundle savedInstanceState, View rootView) {
        fragmentFriendRefresh = (SwipeRefreshLayout) rootView.findViewById(R.id.fragment_friend_refresh);
        fragmentFriendRecycleview = (StickyListHeadersListView) rootView.findViewById(R.id.fragment_friend_recycleview);
        friendFragmentAppbar = (AppBarLayout) rootView.findViewById(R.id.friend_fragment_appbar);
        friendFragmentTitle = (TextView) rootView.findViewById(R.id.friend_fragment_title);
        friendFragmentSelect = (ImageView) rootView.findViewById(R.id.friend_fragment_select);
    }

    @Override
    public int setLayout() {
        return R.layout.fragment_friend;
    }
}
