package com.array;

public abstract class CafeMachine {

    public String makecofe(){
        return "Cofe is doing";
    }
}

//+=====================================


 class Cafemachine80 extends CafeMachine{

    public void boilwater(){
        System.out.println("Take your water!");
    }

}
//+=====================================

class CofeMachine2000 extends CafeMachine{
    public void tea (){
        System.out.println("Making tea");
    }
}

//+=====================================

class CafeMachine7000 extends CafeMachine{
    @Override
    public String makecofe(){
        return "Okuitelnoe Cofe is doing";
    }
    public void Coctel(){
        System.out.println("Making Coctel");
    }

    public void jucey(){
        System.out.println("Making jucey");
    }

}

