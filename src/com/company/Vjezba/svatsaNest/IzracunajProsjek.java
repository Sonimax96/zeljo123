package com.company.Vjezba.svatsaNest;// Scanner se nalazi u java.util paketu
import java.util.Scanner;
public class IzracunajProsjek {

    public static void main(String[] args) {
        // kreiraj Scanner objekat
        Scanner unos = new Scanner(System.in);

        // izbaci pitanje korisniku da unese tri broja
        System.out.print("Unesite tri decimalna broja: ");
        // dodijeli korisnikov unos varijablama
        double broj1 = unos.nextDouble();
        double broj2 = unos.nextDouble();
        double broj3 = unos.nextDouble();

        // izračunaj prosjek tri broja
        double prosjek = (broj1 + broj2 + broj3) / 3;

        // ispiši rezultat korisniku
        System.out.println("Prosjek brojeva " + broj1 + " " + broj2 + " " + broj3 + " je " + prosjek);

        // zatvoriti Scanner
        unos.close();
    }
}
