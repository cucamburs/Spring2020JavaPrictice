package com.array;
import com.array.*;
public class PvmCofeMachine {
    public static void main(String[] args) {

        PvmCofeMachine pv = new PvmCofeMachine();
        CafeMachine cm;

        CafeMachine c7000 = new CafeMachine7000();
        cm = c7000;
        System.out.println(cm.makecofe());
        pv.makeCofeMilk(cm);

        CofeMachine2000 c2000 = new CofeMachine2000();
        cm = c2000;
        System.out.println(cm.makecofe());
        pv.makeCofeMilk(cm);

        Cafemachine80 c80 = new Cafemachine80();
        System.out.println("This is 80 " + c80.makecofe());
        cm = c80;
        pv.makeCofeMilk(c80);

    }

    public void makeCofeMilk (CafeMachine cm){

        System.out.println(cm.makecofe() + " with milk");
        if (cm.toString().substring(10,cm.toString().lastIndexOf('@')).equals("Cafemachine80"))
            ((Cafemachine80) cm).boilwater();

        if (cm.toString().substring(10,cm.toString().lastIndexOf('@')).equals("CofeMachine2000"))
            ((CofeMachine2000) cm).tea();

        if (cm.toString().substring(10,cm.toString().lastIndexOf('@')).equals("CafeMachine7000")){
            ((CafeMachine7000) cm).jucey();  ((CafeMachine7000) cm).Coctel();
        }

    }

}
