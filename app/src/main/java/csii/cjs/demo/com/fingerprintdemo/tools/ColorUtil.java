package csii.cjs.demo.com.fingerprintdemo.tools;

import android.content.Context;

import csii.cjs.demo.com.fingerprintdemo.base.ContextUtil;


/**
 * 描述:
 * <br>作者:陈俊森
 * <br>创建时间:2017年05月10日 17:15
 * <br>邮箱:chenjunsen@outlook.com
 */
public class ColorUtil {

    public static int getColorSrc(int colorSrc){
        return getColorSrc(ContextUtil.getContext(),colorSrc);
    }

    public static int getColorSrc(Context context, int colorSrc){
        int src=0;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            src=context.getColor(colorSrc);
//        }else{
            src=context.getResources().getColor(colorSrc);
//        }
        return src;
    }
}
