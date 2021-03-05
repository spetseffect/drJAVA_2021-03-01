package com.Money;

public class Money {
    private Currency name;
    private int intPart=0;
    private int floatPart=0;
    public Money() {}
    public Money(Currency name) {
        this.name = name;
    }
    public Currency getName() {
        return name;
    }
    public void setName(Currency name) {
        this.name = name;
    }
    public double getValue() {
        double tmp=floatPart;
        do{ tmp/=10; } while(tmp>1);
        if(intPart>=0) return (double)intPart + tmp;
        else return (double)intPart - tmp;
    }
    public void setValue(double value) {
        this.intPart = (int)value;
        double fp = Math.abs(value) - Math.floor(Math.abs(value));
        do{ fp *= 10; } while (fp - Math.floor(fp) > 0);
        this.floatPart = (int)fp;
    }
    public int getIntPart() { return this.intPart; }
    public int getFloatPart() { return this.floatPart; }
    public void addition(double arg){
        double result=this.getValue()+arg;
        this.setValue(result);
    }
    public void subtraction(double arg){
        this.addition(arg*(-1));
    }
}
