package opay.com.oupaypay.ui.account.update.upsupass;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import opay.com.oupaypay.R;
import opay.com.oupaypay.app.base.BaseActivity;

/**
 * Created by wuyinlei on 2017/12/4.
 *
 * @funcition 更新密码成功界面
 */

public class UpdatePassSuccActivity extends BaseActivity {

    private ImageView mIvOperatingType;
    private TextView mTvOperatType;
    private TextView mTvPassOperateType;
    private TextView mTvLogin;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mTvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void initView() {
        mIvOperatingType = (ImageView) findViewById(R.id.iv_operating_type);
        mTvOperatType = (TextView) findViewById(R.id.tv_operat_type);
        mTvPassOperateType = (TextView) findViewById(R.id.tv_pass_operate_type);
        mTvLogin = (TextView) findViewById(R.id.tv_login);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_update_password_success;
    }


}
