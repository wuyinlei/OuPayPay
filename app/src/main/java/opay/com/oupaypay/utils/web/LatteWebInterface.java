package opay.com.oupaypay.utils.web;

import android.webkit.JavascriptInterface;


final class LatteWebInterface {

    private final WebActivity DELEGATE;

    private LatteWebInterface(WebActivity delegate) {
        this.DELEGATE = delegate;
    }

    static LatteWebInterface create(WebActivity delegate) {
        return new LatteWebInterface(delegate);
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    public String event(String params) {
        // TODO: 2017/11/24 需要修改
//        final String action = JSON.parseObject(params).getString("action");
//        final Event event = EventManager.getInstance().createEvent(action);
//        LatteLogger.d("WEB_EVENT",params);
//        if (event != null) {
//            event.setAction(action);
//            event.setDelegate(DELEGATE);
//            event.setContext(DELEGATE.getContext());
//            event.setUrl(DELEGATE.getUrl());
//            return event.execute(params);
//        }
        return null;
    }
}
