package com.levent_j.customtoast;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by levent_j on 16-8-19.
 */
public class ToastUtil {

    private Toast toast;
    private LinearLayout toastLayout;

    public static ToastUtil create(){
        return new ToastUtil();
    }

    public ToastUtil(){

    }

    public ToastUtil shortToast(Context context,String message){
        if (toast==null){
            toast = Toast.makeText(context,message,Toast.LENGTH_SHORT);
        }else {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        p.setMargins(40, 0, 40, 0);
        TextView t  = (TextView)(toast.getView().findViewById(android.R.id.message));
        t.setLayoutParams(p);
        return this;
    }

    public ToastUtil longToast(Context context,String message){
        if (toast==null){
            toast = Toast.makeText(context,message,Toast.LENGTH_LONG);
        }else {
            toast.setText(message);
            toast.setDuration(Toast.LENGTH_LONG);
        }
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        p.setMargins(40, 0, 40, 0);
        TextView t  = (TextView)(toast.getView().findViewById(android.R.id.message));
        t.setLayoutParams(p);
        return this;
    }

    public ToastUtil setTextAttr(int size,int color){
        setTextSize(size);
        setTextColor(color);
        return this;
    }

    public ToastUtil setTextSize(int size){
        View view = toast.getView();
        if (view!=null){
            TextView textView = (TextView) view.findViewById(android.R.id.message);

            textView.setTextSize(size);
        }
        return this;
    }

    public ToastUtil setTextColor(int textColor){
        View view = toast.getView();
        if (view!=null){
            TextView textView = (TextView) view.findViewById(android.R.id.message);
            textView.setTextColor(textColor);
        }
        return this;
    }

    public ToastUtil setBackgroundColor(int backgroundColor){
        View view = toast.getView();
        if (view!=null){
            view.setBackgroundColor(backgroundColor);
        }
        return this;
    }

    public ToastUtil show(){
        toast.show();
        return this;
    }

}
