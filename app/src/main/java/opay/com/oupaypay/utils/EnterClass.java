package opay.com.oupaypay.utils;

import android.content.Context;
import android.content.Intent;

import opay.com.oupaypay.ui.account.login.LoginActivity;
import opay.com.oupaypay.ui.account.register.RegisterActivity;
import opay.com.oupaypay.ui.account.update.uppass.UpdatePassActivity;
import opay.com.oupaypay.ui.account.update.upsupass.UpdatePassSuccActivity;
import opay.com.oupaypay.ui.activity.MainActivity;
import opay.com.oupaypay.ui.fragment.home.collect.CollectMoneyActivity;
import opay.com.oupaypay.ui.fragment.home.discount.DiscountSummaryActivity;
import opay.com.oupaypay.ui.fragment.home.payment.PaymoneyActivity;
import opay.com.oupaypay.ui.fragment.mine.bank.AddBankActivity;
import opay.com.oupaypay.ui.fragment.mine.bank.MyAssetsActivity;
import opay.com.oupaypay.ui.fragment.mine.bank.MyBankActivity;
import opay.com.oupaypay.ui.fragment.mine.bank.VeriCodeSuccessActivity;
import opay.com.oupaypay.ui.fragment.mine.bank.VerificationPhoneActivity;
import opay.com.oupaypay.ui.fragment.mine.code.MyCodeActivity;
import opay.com.oupaypay.ui.fragment.mine.collect.MyCollectActivity;
import opay.com.oupaypay.ui.fragment.mine.message.MyMessageActivity;
import opay.com.oupaypay.ui.fragment.mine.profile.ProfileActivity;
import opay.com.oupaypay.ui.fragment.mine.service.MyCustomerServiceActivity;
import opay.com.oupaypay.utils.scanner.ScannerActivity;

/**
 * Created by wuyinlei on 2017/11/25.
 *
 * @funcition 统一进入界面的工具类
 */

public class EnterClass {

    /**
     * 我的银行卡界面
     *
     * @param context 上下文
     * @param args    参数
     */
    public static void enterMyBankActivity(Context context, String args) {
        Intent intent = new Intent(context, MyBankActivity.class);
        context.startActivity(intent);
    }

    /**
     * 我的二维码界面
     *
     * @param context 上下文
     * @param args    参数
     */
    public static void enterMyCodeActivity(Context context, String args) {
        Intent intent = new Intent(context, MyCodeActivity.class);
        context.startActivity(intent);
    }

    /**
     * 我的收藏界面
     *
     * @param context 上下文
     * @param args    参数
     */
    public static void enterMyCollectActivity(Context context, String args) {
        Intent intent = new Intent(context, MyCollectActivity.class);
        context.startActivity(intent);
    }

    /**
     * 我的消息界面
     *
     * @param context 上下文
     * @param args    其他参数
     */
    public static void enterMyMessageActivity(Context context, String args) {
        Intent intent = new Intent(context, MyMessageActivity.class);
        context.startActivity(intent);
    }

    /**
     * 我的客服界面
     *
     * @param context 上下文
     * @param args    其他参数
     */
    public static void enterMyCustomerServiceActivity(Context context, String args) {
        Intent intent = new Intent(context, MyCustomerServiceActivity.class);
        context.startActivity(intent);
    }

    /**
     * 注册界面
     *
     * @param context 上下文
     */
    public static void enterRegister(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    /**
     * 登录界面
     *
     * @param context 上下文
     */
    public static void enterLogin(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    /**
     * 进入首页
     *
     * @param context 上下文
     */
    public static void enterMain(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    /**
     * 忘记密码界面
     *
     * @param context 上下文
     */
    public static void enterForgetPass(Context context) {
        Intent intent = new Intent(context, UpdatePassActivity.class);
        context.startActivity(intent);
    }

    /**
     * 重置密码成功界面
     *
     * @param context 上下文
     */
    public static void enterResetPassSucc(Context context) {
        Intent intent = new Intent(context, UpdatePassSuccActivity.class);
        context.startActivity(intent);
    }

    /**
     * 自己的银行卡 添加银行卡界面
     *
     * @param context 上下文
     */
    public static void enterAddBank(Context context) {
        Intent intent = new Intent(context, AddBankActivity.class);
        context.startActivity(intent);
    }

    /**
     * 添加银行卡  获取手机验证码的界面
     *
     * @param context 上下文
     */
    public static void enterGetBankCode(Context context) {
        Intent intent = new Intent(context, VerificationPhoneActivity.class);
        context.startActivity(intent);
    }

    /**
     * 添加银行卡验证验证码成功界面
     *
     * @param context 上下文
     */
    public static void enterVeriCodeSuccess(Context context) {
        Intent intent = new Intent(context, VeriCodeSuccessActivity.class);
        context.startActivity(intent);
    }

    /**
     * 进入我的资产界面
     *
     * @param context 上下文
     */
    public static void enterBlanceDetail(Context context) {
        Intent intent = new Intent(context, MyAssetsActivity.class);
        context.startActivity(intent);
    }

    /**
     * 进入我的资产界面
     *
     * @param context 上下文
     */
    public static void enterMyAssets(Context context) {
        Intent intent = new Intent(context, MyAssetsActivity.class);
        context.startActivity(intent);
    }

    /**
     * 进入我的个人信息界面
     *
     * @param context 上下文
     */
    public static void enterProfile(Context context) {
        Intent intent = new Intent(context, ProfileActivity.class);
        context.startActivity(intent);
    }

    /**
     * 进入二维码扫描界面
     * @param context 上下文
     */
    public static void enterCode(Context context) {
        Intent intent = new Intent(context, ScannerActivity.class);
        context.startActivity(intent);
    }

    /**
     * 支付界面
     * @param context 上下文
     */
    public static void enterPayMoney(Context context) {
        Intent intent = new Intent(context, PaymoneyActivity.class);
        context.startActivity(intent);
    }

    /**
     * 收钱界面
     * @param context 上线文
     */
    public static void enterCollectMoney(Context context) {
        Intent intent = new Intent(context, CollectMoneyActivity.class);
        context.startActivity(intent);
    }

    /**
     * 优惠卡卷
     * @param context 上下文
     */
    public static void enterDiscount(Context context) {
        Intent intent = new Intent(context, DiscountSummaryActivity.class);
        context.startActivity(intent);
    }
}
