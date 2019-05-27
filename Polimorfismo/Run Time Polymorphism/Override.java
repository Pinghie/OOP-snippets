package com.fabiomelasi.primoprogetto.OOP.Polimorfismo;

public class Overriding {
    public void Stampa()
    {
        System.out.println("Ciao");
    }

}

class Sottoclasse extends Overriding
{
    @Override
    public void Stampa() {
        System.out.println("Addio");
    }
}

class testMain
{
    public static void main(String args[])
    {
        Overriding obj1 = new Overriding();
        Overriding obj2 = new Sottoclasse();

        obj1.Stampa();  //stampa Ciao
        obj2.Stampa();  //stampa Addio
    }
}
