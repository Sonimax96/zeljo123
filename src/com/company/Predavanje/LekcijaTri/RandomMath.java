package com.company.Predavanje.LekcijaTri;

import java.util.Scanner;

public class RandomMath {
    public static void main(String[] args) {

        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        // pitas korisnika za rez dva br
        int rezultat = prviBroj + drugiBroj;
        System.out.println(" Koliko je  : " + prviBroj + " + " + drugiBroj);
        Scanner unos = new Scanner(System.in);
        int odgovor = unos.nextInt();
        if (odgovor == rezultat) {
            System.out.println(" Tacan je odgovor : ");
        } else {
            System.out.println(" Vas odgovor nije tacan,odgovor je : " + rezultat);

        }
    }
}
