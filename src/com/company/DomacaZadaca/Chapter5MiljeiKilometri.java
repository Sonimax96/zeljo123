package com.company.DomacaZadaca;

import java.util.Scanner;

public class Chapter5MiljeiKilometri {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite milju (velicina za kilometrazu u Americi) : ");

        int unosMilje = unos.nextInt();
        int brojac = 0;

        for (int i = unosMilje; unosMilje <=10; i++) {
            double kilometraza = unosMilje * 1.609 ;
            System.out.println(unosMilje + " milja iznosi " + kilometraza + " kilometara");
            kilometraza+=brojac;
            unosMilje++;
        }
        if (brojac == 10) {
            System.out.println();
            brojac = 0;
        }
    }
}
