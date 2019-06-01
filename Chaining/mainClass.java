package com.fabiomelasi.primoprogetto.OOP.Chaining;

public class mainClass {
    public static void main(String args[])
    {    
        //SI PUÒ SCRIVERE COSÌ
        new Chaining().setTitle("Oggetto").setMessage("Contenuto").stampa();


        //MA ANCHE COSÌ
        Chaining obj = new Chaining();
        obj.setTitle("Oggetto");
        obj.setMessage("Contenuto").stampa();
    }


}
