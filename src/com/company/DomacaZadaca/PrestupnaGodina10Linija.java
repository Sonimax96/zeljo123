package com.company.DomacaZadaca;

import java.util.Scanner;

public class PrestupnaGodina10Linija {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite pocetnu godinu : ");
        int pocetnaGodina = unos.nextInt();
        System.out.println("Unesite krajnju godinu : ");
        int krajnjaGodinja= unos.nextInt();

        int count = 0;

        for (int i=pocetnaGodina; i<krajnjaGodinja; i++ ){
            if (i % 4 == 0 || i % 400 == 0 && i % 100 != 0){
                System.out.print(i+ " ");
                count++;
            }
            if (count ==10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
