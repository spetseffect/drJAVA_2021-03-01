package com.Human;

public class Builder extends Human{
    protected int buildings =0;//count of buildings
    public Builder(String fname, String lname, byte age){
        super(fname,lname,age,"Builder");
    }
    public Builder(String fname, String lname, byte age, int buildings){
        super(fname,lname,age,"Builder");
        if(buildings>0) { this.buildings =buildings; }
    }
    public int getBuildings(){ return this.buildings; }
    public void setBuildings(int value){
        // here any checks depending on your needs
        if(value>=0) {
            this.buildings = value;
            System.out.println("Age changed successfully: " + this.buildings);
        }else{
            System.out.println("Error on changing: the hours can not be negative");
        }
    }
    public void toBuild(){
        System.out.println("I can build.");
    }
}
