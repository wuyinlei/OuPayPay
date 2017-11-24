package opay.com.oupaypay.utils.web;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import opay.com.oupaypay.utils.web.chromeclient.WebChromeClientImpl;
import opay.com.oupaypay.utils.web.client.WebViewClientImpl;
import opay.com.oupaypay.utils.web.route.RouteKeys;
import opay.com.oupaypay.utils.web.route.Router;


public class WebActivityImpl extends WebActivity {


    public static WebActivityImpl create(String url) {

        Intent intent = new Intent();
        final Bundle args = new Bundle();
        args.putString(RouteKeys.URL.name(), url);
        final WebActivityImpl delegate = new WebActivityImpl();

        return delegate;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getWebView());

        if (getUrl() != null) {
            //用原生的方式模拟Web跳转并进行页面加载
            Router.getInstance().loadPage(this, getUrl());
        }
    }

    @Override
    public IWebViewInitializer setInitializer() {
        return this;
    }

    @Override
    public WebView initWebView(WebView webView) {
        return new WebViewInitializer().createWebView(webView);
    }

    @Override
    public WebViewClient initWebViewClient() {
        final WebViewClientImpl client = new WebViewClientImpl(this);
        return client;
    }

    @Override
    public WebChromeClient initWebChromeClient() {
        return new WebChromeClientImpl();
    }

}
