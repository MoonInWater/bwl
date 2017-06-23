package bwl.xiexl.com.bwlapp.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiexl on 2017/6/21.
 */

public class MyApplication extends Application{

    private static Context context;

    public void onCreate(){
        context = getApplicationContext();
    }


    public static Context getContext(){return context;}
}
