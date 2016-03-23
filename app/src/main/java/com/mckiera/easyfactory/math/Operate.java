package com.mckiera.easyfactory.math;

/**
 * author by Mckiera
 * time: 2016/3/23  14:16
 * description:
 * updateTime:
 * update description:
 */
public abstract class Operate {
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public abstract double getResult() throws Exception;

    public static class OperateAdd extends Operate{

        @Override
        public double getResult() {
            return getNumber1() + getNumber2();
        }
    }
    public static class OperateSub extends Operate{

        @Override
        public double getResult() {
            return getNumber1() - getNumber2();
        }
    }

    public static class OperateMul extends Operate{

        @Override
        public double getResult() {
            return getNumber1() * getNumber2();
        }
    }

    public static class OperateDiv extends Operate{

        @Override
        public double getResult() throws Exception {
            if(getNumber2() == 0)
                throw new Exception("除数不能为0");
            return getNumber1() / getNumber2();
        }
    }
}
