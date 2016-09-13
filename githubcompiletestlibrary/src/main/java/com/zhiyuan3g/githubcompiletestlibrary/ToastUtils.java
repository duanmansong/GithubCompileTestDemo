package com.zhiyuan3g.githubcompiletestlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/13.
 */

public class ToastUtils {
    public static void showToast(Context context,CharSequence str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();;
    }
}
