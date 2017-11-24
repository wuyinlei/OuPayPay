package opay.com.oupaypay.utils.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;


import opay.com.oupaypay.app.opay.OPayApplication;

/**
 * Created by wuyinlei on 2017/10/15.
 */

public class DimenUtils {

    /**
     * 获取屏幕的宽度
     *
     * @return int  屏幕宽度
     */
    public static int getScreenWidth() {
        final Resources resources = OPayApplication.getContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    /**
     * 获取屏幕高度
     *
     * @return int 屏幕高度
     */
    public static int getScreenHeight() {
        final Resources resources = OPayApplication.getContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

}
