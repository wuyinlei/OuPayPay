package opay.com.oupaypay.utils;

import android.content.Context;
import android.content.Intent;

import opay.com.oupaypay.ui.fragment.mine.bank.MyBankActivity;
import opay.com.oupaypay.ui.fragment.mine.code.MyCodeActivity;
import opay.com.oupaypay.ui.fragment.mine.collect.MyCollectActivity;
import opay.com.oupaypay.ui.fragment.mine.message.MyMessageActivity;

/**
 * Created by wuyinlei on 2017/11/25.
 */

public class EnterClass {

    public static void enterMyBankActivity(Context context,String args){
        Intent intent = new Intent(context, MyBankActivity.class);
        context.startActivity(intent);
    }

    public static void enterMyCodeActivity(Context context,String args){
        Intent intent = new Intent(context, MyCodeActivity.class);
        context.startActivity(intent);
    }

    public static void enterMyCollectActivity(Context context, String args) {
        Intent intent = new Intent(context, MyCollectActivity.class);
        context.startActivity(intent);
    }

    public static void enterMyMessageActivity(Context context, String args) {
        Intent intent = new Intent(context, MyMessageActivity.class);
        context.startActivity(intent);
    }

    public static void enterMyCustomerServiceActivity(Context context, String args) {

    }
}
