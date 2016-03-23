package com.mckiera.easyfactory.factory;

import com.mckiera.easyfactory.math.Operate;

/**
 * author by Mckiera
 * time: 2016/3/23  14:31
 * description:
 * updateTime:
 * update description:
 */
public class OperateFactory {
    public static Operate createOperate(String operate){
        Operate o = null;
        switch (operate){
            case "+":
                o = new Operate.OperateAdd();
                break;
            case "-":
                o = new Operate.OperateSub();
                break;
            case "x":
                o = new Operate.OperateMul();
                break;
            case "/":
                o = new Operate.OperateDiv();
                break;
        }
        return o;
    }
}
