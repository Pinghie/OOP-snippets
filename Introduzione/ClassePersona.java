package com.fabiomelasi.primoprogetto.OOP;

public class ClassePersona {
    String nome;
    int anni;
    char sesso;

    public ClassePersona(String nomeP, int anniP, char sessoP) //COSTRUTTORE
    {
        nome = nomeP;
        anni = anniP;
        sesso = sessoP;
    }


    public void stampa()
    {
        System.out.println("il nome è:" + nome);
    }

}
