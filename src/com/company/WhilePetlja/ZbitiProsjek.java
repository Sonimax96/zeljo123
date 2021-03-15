package com.company.WhilePetlja;

import java.util.Scanner;

public class ZbitiProsjek {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite cijei broj : ");
        int broj = unos.nextInt();
        int brojac = 0;
        double ukupno = 0;

        ukupno = ukupno + broj;

        while (broj!=0) {
            broj = unos.nextInt();
            ukupno = ukupno + broj;
            brojac++;
        }
        double prosjek = ukupno / brojac;
        System.out.println(" ukupan zbir " + brojac + " brojeva je " + ukupno);
        System.out.println("Prosjek unesenih brojeva  " + prosjek);
    }
}