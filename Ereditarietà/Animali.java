package com.fabiomelasi.primoprogetto.OOP.Ereditarietà;

class Animali { //superclasse
    int occhi;
    int zampe;

    public Animali(int occhi, int zampe) //costruttore superclasse
    {
        this.occhi = occhi;
        this.zampe = zampe;
    }
}

class Cane extends Animali //sottoclasse
{
    public Cane(int occhi, int zampe) //costruttore sottoclasse
    {
        super(occhi, zampe);
    }

    void stampa() //metodo sottoclasse
    {
        System.out.println("Occhi: " + super.occhi);
    }

}
class test {    //classe che contiene il main
    public static void main(String args[]) {
        Cane cane1 = new Cane(2, 4);
        cane1.stampa();
    }
}
