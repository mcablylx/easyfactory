package com.mckiera.easyfactory.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.mckiera.easyfactory.R;
import com.mckiera.easyfactory.factory.OperateFactory;
import com.mckiera.easyfactory.math.Operate;

/**
 * author by Mckiera
 * time: 2016/3/23  11:25
 * description:
 * updateTime:
 * update description:
 */
public class MainActivity extends Activity {
    private static final String TAG = "FUCK";
    private EditText etResult;
    private int number1;
    private int number2;
    private String operate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        etResult = (EditText) findViewById(R.id.etResult);
    }

    public void btnNum(View view){
        String num = (String) view.getTag();
        Log.i(TAG, "num = " + num);
        if(TextUtils.isEmpty(operate)){
            number1 = Integer.parseInt(num);
        }else {
            number2 = Integer.parseInt(num);
        }
        etResult.setText(num);
    }

    public void btnOperate(View view){
        operate = (String) view.getTag();
        Log.i(TAG, "operate = " + operate);
        etResult.setText(operate);
    }

    public void btnClear(View view){
        clear();
        etResult.setText(operate);
    }

    /**
     * 获取结果
     * @param view
     */
    public void btnGetResult(View view){
        if(!TextUtils.isEmpty(operate)){
            Operate o = OperateFactory.createOperate(operate);
            o.setNumber1(number1);
            o.setNumber2(number2);
            try {
                etResult.setText(String.valueOf(o.getResult()));
            } catch (Exception e) {
                etResult.setText(e.getMessage());
            }
            clear();
        }
    }

    public void clear(){
        number1 = 0;
        number2 = 0;
        operate = "";
    }

}
