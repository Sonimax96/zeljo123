package com.company.Predavanje.LekcijaMetode;

import java.util.Scanner;

public class RacuanjeSrtinga6_20 {
    public static void main(String[] args) {
        System.out.println("Unesite rijec : ");
        Scanner unos = new Scanner(System.in);
        String prvi= unos.next();
        System.out.println("Vasa rijec ima " + brojSlova(prvi) + " slova");
    }

    public static int brojSlova(String s) {
        int brojac = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (Character.isLetter(c)) ;
            brojac++;
        }
        System.out.println(" " + brojac);
        return brojac;
    }
}
