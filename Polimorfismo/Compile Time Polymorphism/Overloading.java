package com.fabiomelasi.primoprogetto.OOP.Overloading;

public class Overloading {
    public int add(int x, int y)
    {
        return x+y;
    }

    public int add(int x, int y, int z)
    {
        return x+y+z;
    }

    public float add(int x, float y)
    {
        return x+y;
    }
}

class test {
    public static void main(String args[])
    {

        Overloading Addizione = new Overloading();
        System.out.println(Addizione.add(2, 6));        //CHIAMA LA PRIMA FUNZIONE
        System.out.println(Addizione.add(3, 8, 18));  //CHIAMA LA SECONDA FUNZIONE
        System.out.println(Addizione.add(3, 3.4f));     //CHIAMA LA TERZA FUNZIONE
    }

}
