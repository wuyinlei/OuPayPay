package opay.com.oupaypay.utils.scanner;

import android.app.Activity;
import android.support.v4.app.Fragment;

import me.dm7.barcodescanner.zbar.Result;
import me.dm7.barcodescanner.zbar.ZBarScannerView;

/**
 * Created by wuyinlei on 2017/11/13.
 *
 * @function 扫描fragment
 */

public class ScannerActivity extends Activity implements ZBarScannerView.ResultHandler {

    @Override
    public void handleResult(Result result) {

    }

//    private ScanView mScanView = null;
//
//    @Override
//    public Object setLayout() {
//        return mScanView;
//    }
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (mScanView == null) {
//            mScanView = new ScanView(getContext());
//        }
//        //自动对焦
//        mScanView.setAutoFocus(true);
//        //设置回调监听
//        mScanView.setResultHandler(this);
//    }
//
//
//    @Override
//    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
//
//    }
//
//    @Override
//    public void handleResult(Result result) {
//        @SuppressWarnings("unchecked")
//        final IGlobalCallback<String> callback = CallbackManager
//                .getInstance()
//                .getCallback(CallbackType.ON_SCAN);
//        if (callback != null) {
//            callback.executeCallback(result.getContents());
//        }
//
////        getSupportDelegate().pop();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        if (mScanView != null) {
//            mScanView.startCamera();
//        }
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        if (mScanView != null) {
//            mScanView.stopCameraPreview();
//            mScanView.stopCamera();
//        }
//    }

}
