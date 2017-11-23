package opay.com.oupaypay.utils.camera;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.blankj.utilcode.util.FileUtils;

import java.io.File;

import opay.com.oupaypay.R;
import opay.com.oupaypay.utils.file.FileUtil;

/**
 * Created by wuyinlei on 2017/11/8.
 *
 * @function 照相机处理类
 */

public class CameraHandler implements View.OnClickListener {

    private final AlertDialog DIALOG;

    private Context mContext;

    public CameraHandler(Context  context) {
        this.mContext = context;
        DIALOG = new AlertDialog.Builder(mContext).create();
    }

    final void beginCameraDialog(){
        DIALOG.show();
        final Window window = DIALOG.getWindow();
        if (window != null) {
            window.setContentView(R.layout.dialog_camera_panel);
            window.setGravity(Gravity.BOTTOM);
            window.setWindowAnimations(R.style.anim_panel_up_from_bottom);
//            设置背景颜色,只有设置了这个属性,宽度才能全屏MATCH_PARENT
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            //设置属性
            final WindowManager.LayoutParams params = window.getAttributes();
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            params.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
            params.dimAmount = 0.5f;
            window.setAttributes(params);

            window.findViewById(R.id.photodialog_btn_cancel).setOnClickListener(this);
            window.findViewById(R.id.photodialog_btn_take).setOnClickListener(this);
            window.findViewById(R.id.photodialog_btn_native).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.photodialog_btn_cancel) {
            DIALOG.cancel();
        } else if (id == R.id.photodialog_btn_take) {
            takePhoto();
            DIALOG.cancel();
        } else if (id == R.id.photodialog_btn_native) {
            pickPhoto();
            DIALOG.cancel();
        }
    }

    private String getPhotoName() {
        return FileUtil.getFileNameByTime("IMG", "jpg");
    }

    /**
     * 拍照
     */
    private void takePhoto() {
        final String currentPhotoName = getPhotoName();
        final  Intent intent  = new Intent(MediaStore.ACTION_IMAGE_CAPTURE); //拍照意图
        final File tempFile = new File(FileUtil.CAMERA_PHOTO_DIR,currentPhotoName);

        //兼容7.0以及以上写法
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            final ContentValues contentValues = new ContentValues();
            contentValues.put(MediaStore.Images.Media.DATA,tempFile.getPath());
            final Uri uri = mContext.getContentResolver()
                    .insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,contentValues);

            //需要将Uri路径转换为实际的路径
            final File realFile =
                    FileUtils.getFileByPath(FileUtil.getRealFilePath(mContext, uri));
            final Uri realUri = Uri.fromFile(realFile);
            CameraImageBean.getInstance().setPath(realUri);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);


        } else {

            final Uri fileUri = Uri.fromFile(tempFile);
            CameraImageBean.getInstance().setPath(fileUri);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
        }

        ((Activity)mContext).startActivityForResult(intent, RequestCode.TAKE_PHOTO);

    }


    /**
     *
     */
    private void pickPhoto() {
        final Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        ((Activity)mContext).startActivityForResult
                (Intent.createChooser(intent, "选择获取图片的方式"), RequestCode.PICK_PHOTO);
    }


}
