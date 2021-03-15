package com.company.JaiBoki;

import java.util.*;
public class PravoslavniUskrs {
    public static void main(String[] args) {
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Program izračunava datum pravoslavnog ");
        System.out.println("Uskrsa u Srbiji za datu godinu u ");
        System.out.println("periodu od 1900. do 2099. godine.");
        System.out.print("\nUnesite godinu za datum Uskrsa: ");
        int g = tastatura.nextInt();
        int a = g % 4;
        int b = g % 7;
        int c = g % 19;
        int d = (19 * c + 15) % 30;
        int e = (2 * a + 4 * b - d + 34) % 7;
        int f = d + e + 114;
// Mesec i dan pravoslavnog Uskrsa po julijanskom kalendaru
        int mUskrs = f / 31;
        int dUskrs = f % 31 + 1;
// Dodavanje 13 dana od 1919. godine kada je Srbija
// prešla na računanje po gregorijanskom kalendaru
        if (g >= 1919) {
            dUskrs = dUskrs + 13;
            if (mUskrs == 3 && dUskrs > 31) {
                dUskrs = dUskrs % 31;
                mUskrs = 4;
            }
            else if (mUskrs == 4 && dUskrs > 30) {
                dUskrs = dUskrs % 30;
                mUskrs = 5;
            }
        }
        System.out.print("Pravoslavni Uskrs je u nedelju, ");
        System.out.println(dUskrs + "." + mUskrs + "." + g + ".");
    }
}