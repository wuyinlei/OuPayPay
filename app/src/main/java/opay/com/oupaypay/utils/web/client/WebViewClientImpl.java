package opay.com.oupaypay.utils.web.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import opay.com.oupaypay.app.opay.OPay;
import opay.com.oupaypay.utils.web.route.Router;

public class WebViewClientImpl extends WebViewClient {

    private final Context mContext;
    private static final Handler HANDLER = OPay.getHandler();


    public WebViewClientImpl(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return Router.getInstance().handleWebUrl(mContext, url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        HANDLER.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 1000);
    }
}
