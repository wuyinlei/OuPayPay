package opay.com.oupaypay.app.interceptor;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import opay.com.oupaypay.utils.file.OPayPreference;
import rx.Observable;
import rx.Observer;

/**
 * Created by wuyinlei on 2017/11/4.
 *
 * @function
 */

public class AddCookieInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {

        final Request.Builder builder = chain.request().newBuilder();
        Observable.just(OPayPreference.getCustomAppProfile("cookie"))
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String cookie) {
                        //给原生API请求附带上WEBVIEW拦截下来的Cookie
                        builder.addHeader("Cookie", cookie);

                    }
                });

        return chain.proceed(builder.build());
    }
}
