package com.company.Predavanje.LekcijaMetode;

public class SAbiranje {
    public static void main(String[] args) {
       int sabiranjeInt= Sabiranje(2 , 4);
        double sabiranjedoub= sabiranjedecimalno(2.0 , 4.00);
        System.out.println("Sabiranj sa int : " +sabiranjeInt);
        System.out.println("Sabiranjje s double : "+sabiranjedoub);
    }
    public static int Sabiranje(int prviBroj , int drugiBroj) {
        return prviBroj+drugiBroj;
    }
    public static double sabiranjedecimalno (double prviBroj , double drugiBroj){

    return prviBroj+drugiBroj;
    }
    }
