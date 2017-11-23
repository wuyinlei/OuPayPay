package opay.com.oupaypay.app.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition fragment基类
 */

public abstract class BaseFragment extends Fragment {

    protected FragmentActivity mActivity = null;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (FragmentActivity) context;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView;
        rootView = inflater.inflate((int) setLayout(), container, false);
        onBindView(savedInstanceState, rootView);
        initData();
        initListener();
        return rootView;
    }

    protected abstract void initListener();

    protected abstract void initData();

    protected abstract void onBindView(Bundle savedInstanceState, View rootView);

    public abstract int setLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mActivity = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
