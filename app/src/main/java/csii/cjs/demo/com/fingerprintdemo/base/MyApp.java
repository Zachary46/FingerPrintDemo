package csii.cjs.demo.com.fingerprintdemo.base;

import android.app.Application;

/**
 * 描述:
 * <p>
 * 作者:陈俊森
 * 创建时间:2017年11月10日 10:09
 * 邮箱:chenjunsen@outlook.com
 *
 * @version 1.0
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtil.init(getApplicationContext());
    }
}
