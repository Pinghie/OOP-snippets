package com.fabiomelasi.primoprogetto.OOP.Chaining;

public class Chaining {

    String titolo;
    String messaggio;

    public Chaining setTitle(String titolo)
    {
        this.titolo = titolo;
        return this;  //ritorno dell'oggetto
    }

    public Chaining setMessage(String messaggio)
    {
        this.messaggio = messaggio;
        return this;  //ritorno dell'oggetto
    }

    public void stampa()
    {
        System.out.println("Titolo: " + titolo + "\nMessaggio: " + messaggio);
    }

}
