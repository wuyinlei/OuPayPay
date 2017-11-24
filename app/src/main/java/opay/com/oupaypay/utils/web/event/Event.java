package opay.com.oupaypay.utils.web.event;

import android.content.Context;
import android.webkit.WebView;

import opay.com.oupaypay.utils.web.WebActivity;

public abstract class Event implements IEvent {

    private Context mContent = null;
    private String mAction = null;
    private WebActivity mActivity = null;
    private String mUrl = null;
    private WebView mWebView = null;

    public Context getContext() {
        return mContent;
    }

    public WebView getWebView() {
        return mActivity.getWebView();
    }

    public void setContext(Context mContent) {
        this.mContent = mContent;
    }

    public String getAction() {
        return mAction;
    }

    public void setAction(String mAction) {
        this.mAction = mAction;
    }

    public WebActivity getActivity() {
        return mActivity;
    }

    public void setDelegate(WebActivity activity) {
        this.mActivity = activity;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
