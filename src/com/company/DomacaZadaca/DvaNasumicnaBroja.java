package com.company.DomacaZadaca;
/* Napisati program koji generiše dva cijela, nasumična broja te
traži od korisnika da odgovori pitanje tipa: “Koliko je 8 - 3?” gdje su 8 i 3 nasumično generisani brojevi.
 Ispisati rezultat korisniku - ako je tacan, cestitati ako nije - ispisati tacan odgovor.
Ukoliko je prvi generisani broj manji od drugog,
program treba da im zamijeni pozicije - rezultat oduzimanja ne smije biti negativan broj */

public class DvaNasumicnaBroja {
    public static void main(String[] args) {
        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        int rezultat = prviBroj - drugiBroj;
        int rezultatJedan = drugiBroj - prviBroj;
        System.out.println("Zadatak : " + prviBroj + " - " + drugiBroj ) ;
        System.out.println( " Rezultat je : " + rezultat );
        if ( drugiBroj > prviBroj) {
            System.out.println("Rezultat je = " + rezultatJedan + " jer su se zamjenili mjesta " +
                    "drugog broja  i prvog");
        }
    }
}
