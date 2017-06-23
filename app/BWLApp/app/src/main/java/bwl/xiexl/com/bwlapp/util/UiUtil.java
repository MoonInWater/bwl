package bwl.xiexl.com.bwlapp.util;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperToast;

import bwl.xiexl.com.bwlapp.R;
import bwl.xiexl.com.bwlapp.base.MyApplication;

/**
 * Created by xiexl on 2017/6/21.
 */

public class UiUtil {

    /*获取上下文*/
    public static Context getContext(){return MyApplication.getContext();}

    private static SuperToast toast; //解决重复吐司造成的混乱
    /**Toast简化写法*/
    public static void showToast(String content) {
        if(toast == null) {
            toast = new SuperToast(getContext())
                    .setText(content)
                    .setDuration(Style.DURATION_SHORT)
                    .setFrame(Style.FRAME_STANDARD)
                    .setColor(Color.BLACK);
        }
        toast.setText(content);
        toast.show();
    }


    /**
     * 根据id获取颜色值
     */
    public static int getColor(int id) {
            return getContext().getResources().getColor(id);
    }

}
