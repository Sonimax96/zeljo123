package com.company.Predavanje.LekcijaCetiri;

import java.util.Scanner;

public class Prestupne10Godina {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite pocetnu godinu :");
        int pocetnaGodina = unos.nextInt();
        System.out.println("Unesite krajnju godinu : ");
        int krajnaGodina = unos.nextInt();

        int brojac = 0;

        for (int godina = pocetnaGodina; godina < krajnaGodina; godina++) {
            if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                System.out.print(godina + " ");
                brojac++;
                if (brojac ==10) {
                    System.out.println();
                    brojac=0;

                }
            }

        }
    }
}

