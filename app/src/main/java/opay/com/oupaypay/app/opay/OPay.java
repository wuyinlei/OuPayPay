package opay.com.oupaypay.app.opay;

import android.content.Context;
import android.os.Handler;

import java.util.HashMap;

/**
 * Created by wuyinlei on 2017/7/10.
 *
 * @function
 */

public final class OPay {


    public static Configurator init(Context context) {
        getConfitgurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());

        return Configurator.getInstance();
    }

    public static HashMap<String, Object> getConfitgurations() {
        return Configurator.getInstance().getCainiaoConfigs();
    }

    /**
     * 获取全局的Handler
     *
     * @return Handler
     */
    public static Handler getHandler() {
        return getConfiguration(ConfigType.HANDLER.name());
    }


    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    /**
     * 获取全局的上下文
     *
     * @return Context
     */
    public static Context getApplicationContext() {
        return (Context) getConfitgurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }

}
