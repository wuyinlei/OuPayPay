package opay.com.oupaypay.app.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.webkit.PermissionRequest;
import android.widget.Toast;

import com.yalantis.ucrop.UCrop;

import opay.com.oupaypay.constant.Constants;
import opay.com.oupaypay.utils.callback.CallbackManager;
import opay.com.oupaypay.utils.callback.CallbackType;
import opay.com.oupaypay.utils.callback.IGlobalCallback;
import opay.com.oupaypay.utils.camera.CainiaoCamera;
import opay.com.oupaypay.utils.camera.CameraImageBean;
import opay.com.oupaypay.utils.camera.RequestCode;
import opay.com.oupaypay.utils.scanner.ScannerActivity;

/**
 * Created by wuyinlei on 2017/11/23.
 *
 * @funcition
 */

public abstract class PermissionCheckerActivity extends BaseActivity {

    /**
     * 开启二维码扫描 进行公开调用
     *
     * @param context 上下文
     */
    public void startScan(Context context) {
        // TODO: 2017/11/23 在这进行权限判断   需要照相权限   写入本地文件权限

        if (context instanceof BaseActivity) {
            Intent intent = new Intent(context, ScannerActivity.class);
            ((BaseActivity) context).startActivityForResult(intent, RequestCode.SCAN);
        }

//        Constants.home_index
    }

    /**
     * 开启照片选择和照相方式
     */
    public void startCamera() {
        // TODO: 2017/11/23 在这进行权限判断   需要照相权限   写入本地文件权限
        CainiaoCamera.start(this);
    }

    private void showRationaleDialog(final PermissionRequest request) {
        new AlertDialog.Builder(this)
                .setPositiveButton("同意使用", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        request.proceed();
                    }
                })
                .setNegativeButton("拒绝使用", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        request.cancel();
                    }
                })
                .setCancelable(false)
                .setMessage("权限管理")
                .show();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.TAKE_PHOTO:
                    final Uri resultUri = CameraImageBean.getInstance().getPath();
                    UCrop.of(resultUri, resultUri)
                            .withMaxResultSize(400, 400)
                            .start(PermissionCheckerActivity.this);
                    break;
                case RequestCode.PICK_PHOTO:
                    if (data != null) {
                        final Uri pickPath = data.getData();
                        //从相册选择后需要有个路径存放剪裁过的图片
                        final String pickCropPath = CainiaoCamera.creareCropFile().getPath();
                        assert pickPath != null;
                        UCrop.of(pickPath, Uri.parse(pickCropPath))
                                .withMaxResultSize(400, 400)
                                .start(PermissionCheckerActivity.this);
                    }
                    break;
                case RequestCode.CROP_PHOTO:
                    final Uri cropUri = UCrop.getOutput(data);
                    //拿到剪裁后的数据进行处理
                    @SuppressWarnings("unchecked") final IGlobalCallback<Uri> callback = CallbackManager
                            .getInstance()
                            .getCallback(CallbackType.ON_CROP);
                    if (callback != null) {
                        callback.executeCallback(cropUri);
                    }
                    break;
                case RequestCode.CROP_ERROR:
                    Toast.makeText(this, "剪裁出错", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }

    }

}
