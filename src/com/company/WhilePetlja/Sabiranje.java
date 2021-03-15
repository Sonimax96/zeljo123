package com.company.WhilePetlja;

import java.util.Scanner;

public class Sabiranje {
    public static void main(String[] args) {
        int brojjedan = (int) (Math.random() * 10);
        int brojDva = (int) (Math.random() * 10);
        System.out.println("Koliko je " + brojjedan + " + " + brojDva + " ? ");

        Scanner unos = new Scanner(System.in);
        int odgovor = unos.nextInt();
        while (odgovor != brojDva + brojDva) {
            System.out.println("Zao Nam je unijeli ste pogrresan odgovor,pokusajte ponovo ");

            System.out.println("Koliko je " + brojjedan + " + " + brojDva + " ? ");
            odgovor = unos.nextInt();
        }
        System.out.println("Cestitam vam pogodili ste tacan rezultat ! ");
        unos.close();
    }
}