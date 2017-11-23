package opay.com.oupaypay.utils.camera;

import android.content.Context;
import android.net.Uri;

import opay.com.oupaypay.utils.file.FileUtil;


/**
 * Created by wuyinlei on 2017/11/8.
 *
 * @function 照相机调用类
 */

public class CainiaoCamera {

    public static Uri creareCropFile() {
        return Uri.parse
                (FileUtil.createFile("crop_image",
                        FileUtil.getFileNameByTime("IMG", "jpg"))
                        .getPath());
    }

    public static void start(Context context) {
        new CameraHandler(context).beginCameraDialog();
    }

}
