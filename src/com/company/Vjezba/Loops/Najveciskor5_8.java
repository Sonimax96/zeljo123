package com.company.Vjezba.Loops;

import java.util.Scanner;

public class Najveciskor5_8 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int najvecirezultat = 0;
        String najveciRezultatstudenta = " ";
        int brojstudenta = unos.nextInt();
        System.out.println("Unesite broj studenata i skor :");

        for (int i = 0; i < brojstudenta; i++) {
            System.out.println("Student " + (i+1 ) + " Ime  ");
            String ime = unos.next();
            System.out.println("Rezultat ");
            int rezultat = unos.nextInt();

            if (rezultat > najvecirezultat) {
                najvecirezultat = rezultat;
                najveciRezultatstudenta = ime;
            }

        }
        System.out.println("Najveci rezultat studenta je : " + najveciRezultatstudenta);

    }
}
