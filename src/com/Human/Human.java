package com.Human;

public class Human {
    protected String fname;
    protected String lname;
    protected byte age;
    protected String profession=null;
    public Human(){}
    public Human(String fname, String lname, byte age){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
    }
    public Human(String fname, String lname, byte age, String profession){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
        this.profession=profession;
    }
    public String getFirstName(){ return  fname; }
    public void setFirstName(String value){
        // here any checks depending on your needs
        this.fname=value;
        System.out.println("First name changed successfully: "+this.fname);
    }
    public String getLastName(){ return lname; }
    public void setLastName(String value){
        // here any checks depending on your needs
        this.lname=value;
        System.out.println("Last name changed successfully: "+this.lname);
    }
    public byte getAge(){ return age; }
    public void setAge(byte value){
        // here any checks depending on your needs
        if(value>=0) {
            this.age = value;
            System.out.println("Age changed successfully: " + this.age);
        }else{
            System.out.println("Error on changing: the age can not be negative");
        }
    }
}
