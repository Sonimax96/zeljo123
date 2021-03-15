package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

public class CjeliBroj {
    public static void main(String[] args) {
        int prvaCifra;
        int drugaCifra;
        int trecaCifra;
        int uneseniBroj;
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite trocifreni broj : ");
        uneseniBroj = unos.nextInt();
        trecaCifra = uneseniBroj % 10;
        drugaCifra = uneseniBroj / 10 % 10;
        prvaCifra = uneseniBroj / 100;

        System.out.println("prvaCifra = " + prvaCifra);
        System.out.println("drugaCifra = " + drugaCifra);
        System.out.println("trecaCifra = " + trecaCifra);

    }
}