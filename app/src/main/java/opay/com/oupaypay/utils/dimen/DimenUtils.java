package opay.com.oupaypay.utils.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;


import opay.com.oupaypay.app.OPayApplication;

/**
 * Created by wuyinlei on 2017/10/15.
 */

public class DimenUtils {

    public static int getScreenWidth() {
        final Resources resources = OPayApplication.getContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = OPayApplication.getContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }

}
