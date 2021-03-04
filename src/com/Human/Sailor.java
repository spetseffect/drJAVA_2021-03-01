package com.Human;

public class Sailor extends Human{
    protected int sailings=0;//count of voyages
    public Sailor(String fname, String lname, byte age){
        super(fname,lname,age,"Sailor");
    }
    public Sailor(String fname, String lname, byte age, int hours){
        super(fname,lname,age,"Sailor");
        if(hours>0) { this.sailings=hours; }
    }
    public int getSailings(){ return this.sailings; }
    public void setSailings(int value){
        // here any checks depending on your needs
        if(value>=0) {
            this.sailings = value;
            System.out.println("Age changed successfully: " + this.sailings);
        }else{
            System.out.println("Error on changing: the hours can not be negative");
        }
    }
    public void toSwim(){
        System.out.println("I can swim.");
    }
}
