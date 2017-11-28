package opay.com.oupaypay.ui.fragment.bills;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.view.View;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseFragment;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition 账单界面
 */

public class BillsFragment extends BaseFragment {
    private StickyListHeadersListView billsFragmentListview;
    private AppBarLayout billsFragmentAppbar;
    private TextView billsFragmentTitle;
    private TextView billsFragmentSelect;



    @Override
    protected void initListener() {


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onBindView(Bundle savedInstanceState, View rootView) {
        billsFragmentListview = (StickyListHeadersListView)rootView.findViewById(R.id.bills_fragment_listview);
        billsFragmentAppbar = (AppBarLayout)rootView.findViewById(R.id.bills_fragment_appbar);
        billsFragmentTitle = (TextView)rootView.findViewById(R.id.bills_fragment_title);
        billsFragmentSelect = (TextView)rootView.findViewById(R.id.bills_fragment_select);

    }





    @Override
    public int setLayout() {
        return R.layout.fragment_bills;
    }
}
