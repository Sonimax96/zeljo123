package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

/*apišite program koji omogućava korisniku da pogodi hoće li se okrenuti
novčić rezultira glavama ili repovima. Program nasumično generira cijeli broj 0 ili 1,
što predstavlja glavu ili rep. Program od korisnika traži da unese nagađanje i
izvještava je li pretpostavka tačna ili netačna*/
public class PismoGlava {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        final int pismo = 0;
        final int glava = 1;
        System.out.println(" Unesite pismo (0) ili glava (1)");
        int Ja = unos.nextInt();
        int kompijuter = (int) (Math.random() * 2);
        System.out.print( " Kompijuter je : " + kompijuter);
        switch (kompijuter) {
            case 0:
                System.out.println("pismo");break;
            case 1:
                System.out.println("glava");break;
        }
        if (Ja == kompijuter)
            System.out.println(" Pobjedio si " );
        else
            System.out.println(" Izgubio si " );
    }
}