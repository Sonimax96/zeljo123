package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class DuzinaStringa {
    public static void main(String[] args) {
        System.out.println("Unesite neki string : ");
        Scanner unos = new Scanner(System.in);

        String duzina = unos.nextLine();
        System.out.println("duzina stringa je "+duzina.length());
        System.out.println("Njegov prvi karakter je : "+duzina.charAt(0));
    }
}
