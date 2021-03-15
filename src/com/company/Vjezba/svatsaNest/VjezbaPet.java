package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

/* Napišite program koji čita subtotal
        i stopa napojnice, zatim izračunava napojnicu i ukupan iznos. Na primjer, ako je
        korisnik unese 10 za ukupan zbir i 15% za napojnicu, program prikazuje 1,5 dolara
        kao napojnicu i 11,5 dolara ukupno. Evo primjera izvođenja: */
public class VjezbaPet {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println( "Unesite novac i napojnicu : ");
        double ukupanIznos;
        double datNovac = unos.nextDouble();
        double napojnica;
        napojnica = datNovac * 0.15;
        ukupanIznos = datNovac + napojnica;
        System.out.println( " Napojnica iznosi " + napojnica + " km" + " a ukupan iznos " + ukupanIznos +" km");
    }
}
