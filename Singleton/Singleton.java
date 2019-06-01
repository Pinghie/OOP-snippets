package com.fabiomelasi.primoprogetto.OOP.Singleton;

public class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton(){}

    public static Singleton getInstance()
    {
        return obj;
    }

    public static void DiciQualcosa()
    {
        System.out.println("Qualcosa");
    }
    
}
