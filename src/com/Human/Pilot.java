package com.Human;

public class Pilot extends Human{
    protected int hours=0;//flight hours
    public Pilot(String fname, String lname, byte age){
        super(fname,lname,age,"Pilot");
    }
    public Pilot(String fname, String lname, byte age, int hours){
        super(fname,lname,age,"Pilot");
        if(hours>0) { this.hours=hours; }
    }
    public int getHours(){ return this.hours; }
    public void setHours(int value){
        // here any checks depending on your needs
        if(value>=0) {
            this.hours = value;
            System.out.println("Age changed successfully: " + this.hours);
        }else{
            System.out.println("Error on changing: the hours can not be negative");
        }
    }
    public void toFly(){
        System.out.println("I can fly.");
    }
}
