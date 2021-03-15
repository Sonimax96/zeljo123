package com.company.String;

import java.util.Scanner;

public class DuzinaStringa {
    public static void main(String[] args) {
        System.out.println("unesite neku recenicu : ");
        Scanner unos = new Scanner(System.in);

        String nekiString = unos.nextLine();

        System.out.println("Duzina stringa je "+ nekiString.length());
        System.out.println("Prvo slovo stringa je " + nekiString.charAt(0));
    }
}
