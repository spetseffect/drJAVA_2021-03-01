package com.Human;

public class Main {

    public static void main(String[] args) {
        Human anyHuman=new Human();
        Human simpleHuman=new Human("Vasia","Pupkin", (byte) 18);
        Pilot pilot=new Pilot("Pasha","Filin",(byte) 28,350);
        Sailor sailor=new Sailor("Ivan","Ivanov",(byte) 23,5);
        Builder builder=new Builder("Chingiz","Lahov",(byte) 33,48);
        System.out.println("anyHuman: "+anyHuman.toString());
        System.out.println("simpleHuman: "+simpleHuman.toString());
        System.out.print(pilot.toString()+" says: ");
        pilot.toFly();
        System.out.print(sailor.toString()+" says: ");
        sailor.toSwim();
        System.out.print(builder.toString()+" says: ");
        builder.toBuild();
    }
}
