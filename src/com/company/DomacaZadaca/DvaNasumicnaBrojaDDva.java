package com.company.DomacaZadaca;

import java.util.Scanner;

public class DvaNasumicnaBrojaDDva {
    public static void main(String[] args) {
        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        int rezultat = prviBroj - drugiBroj;
        int rezultatJedan = drugiBroj - prviBroj;
        System.out.println("Zadatak : " + prviBroj + " - " + drugiBroj + " ? ");
        Scanner unos = new Scanner(System.in);
        int odgovor = unos.nextInt();
        System.out.println( " Rezultat je : " +rezultat);
        if ( drugiBroj > prviBroj ) {
            System.out.println(" Rezultat ne moze biti negativan,rezultat je " + rezultatJedan);
        }
        }
    }