package com.fabiomelasi.primoprogetto.OOP.Incapsulamento;

public class MainClass {
    public static void main(String args[])
    {
        ClassePersonaIncapsulamento persona1 = new ClassePersonaIncapsulamento();
        persona1.setNome("Mario");
        persona1.setAnni(26);
        persona1.setSesso('m');

        System.out.println("Nome: " + persona1.getNome() + " Anni: " + persona1.getAnni() + " Sesso: " + persona1.getSesso());
    }
}
