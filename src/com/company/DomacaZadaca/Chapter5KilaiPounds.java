package com.company.DomacaZadaca;

import java.util.Scanner;

public class Chapter5KilaiPounds {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite kg kako bi pretvorili u pounds : ");

        int unosKilograma = unos.nextInt();
        int zadnjiUnos=200;
        int brojac=0;
        for (int i = unosKilograma; unosKilograma < zadnjiUnos; i++) {
            double iznosUpoundu = 2.2 * unosKilograma ;
            System.out.println(unosKilograma + " kg iznosi " + iznosUpoundu + " pounds");
            iznosUpoundu+=brojac;
            unosKilograma++;
        }
        if (brojac==200){
            System.out.println();
            brojac=0;
        }


    }
}