package com.company.WhilePetlja;

import java.util.Scanner;

//nastaviti sa ucitavanjem brojeva sve dok korisnik ne unese 0
public class DoWhilePetlja {
    public static void main(String[] args) {
        int broj;
        int suma = 0;

        do {
            System.out.println(" Unesite brojeve ( 0 prekida unos ) ");
            Scanner unos = new Scanner(System.in);
            broj = unos.nextInt();
            suma = suma + broj;
        }
        while (broj != 0);
        System.out.println("Suma svih unjeti brojeva je " + suma);
    }
}