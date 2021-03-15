package com.company.Vjezba.MetodeiString;

public class SabiranjeIntDouble {
    public static void main(String[] args) {
        int prvoSabiranje=Sabiranjeint(5 , 9);
        double drugoSabiranje=Sabiranjedouble(7.4, 2.6);
        System.out.println("Zbir dva inta iznosi : " + prvoSabiranje);
        System.out.println("Zbir dva double iznosi : " + drugoSabiranje);
    }
    public static int Sabiranjeint(int prvibroj , int drugibroj){
        return prvibroj+drugibroj;
    }
    public static double Sabiranjedouble (double prvibroj , double drugibroj){
        return prvibroj+drugibroj;
    }
}
