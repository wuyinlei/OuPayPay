package opay.com.oupaypay.utils.callback;

import java.util.WeakHashMap;

/**
 * Created by ruolanmingyue on 2017/11/8.
 *
 * @function 全局的callback   用于全局的回调  例如设置的开关   二维码的扫描回调   头像的设置回调
 */

public class CallbackManager {

    private static final WeakHashMap<Object, IGlobalCallback> CALLBACKS = new WeakHashMap<>();

    private static class Holder {
        private static final CallbackManager INSTANCE = new CallbackManager();
    }

    public static CallbackManager getInstance() {
        return Holder.INSTANCE;
    }

    public CallbackManager addCallback(Object tag, IGlobalCallback callback) {
        CALLBACKS.put(tag, callback);
        return this;
    }

    public IGlobalCallback getCallback(Object tag) {
        return CALLBACKS.get(tag);
    }

}
