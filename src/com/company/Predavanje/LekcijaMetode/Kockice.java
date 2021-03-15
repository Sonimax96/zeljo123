package com.company.Predavanje.LekcijaMetode;

public class Kockice {
    public static int zavrtiKocke(){
        int rezultatBacanje=(int) (Math.random()*6)+1;
        return rezultatBacanje;
    }
    public static int sumaBacanja(){
        return sumaBacanja();
    }
}
