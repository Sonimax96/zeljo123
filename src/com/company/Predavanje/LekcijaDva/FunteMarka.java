package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

public class FunteMarka {
    public static void main(String[] args) {
        final double kursFunte = 2.20;
        double rezultat = 0;
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite neki iznos u funtama : ");
        final double funta = unos.nextDouble();
        rezultat = funta * kursFunte;
        System.out.println("To odgovara vrijednosti od " + rezultat + " BAM");
        if (funta >= 0) {
            System.out.println("To odgovara vrijednosti od " + rezultat + " BAM");
        }
        else  {                   // kod else nemamo uslova
            System.out.println(" Ne mozete unijeti negativnu vrijednost");
        }
    }
}




