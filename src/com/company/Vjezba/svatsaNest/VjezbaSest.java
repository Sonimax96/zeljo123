package com.company.Vjezba.svatsaNest;

import java.util.Scanner;
import java.util.SortedMap;

/* Napišite program koji čita cijeli broj između 0 i
1000 i dodaje sve znamenke u cijeli broj. Na primjer, ako je cijeli broj 932,
zbroj svih njegovih cifara je 14.
Savjet: Koristite operater% za izdvajanje znamenki, a pomoću / operatora za uklanjanje
izvučena cifra. Na primjer, 932% 10 = 2 i 932/10 = 93.*/
public class VjezbaSest {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println( " unesite zeljeni broj :");
        int zeljeniBroj = unos.nextInt();
        int brojJedan ;
        int brojDva;
        int brojTri;
        brojJedan = zeljeniBroj / 100;
        brojDva = zeljeniBroj % 100 / 10;
        brojTri = zeljeniBroj % 10;
        System.out.println("Broj jedan je = " + brojJedan);
        System.out.println("Broj dva je = " + brojDva);
        System.out.println("Broj tri je = " + brojTri);


    }
}
