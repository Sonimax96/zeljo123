package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// Napišite program koji čita u radijusu
//i dužinu cilindra i izračunava površinu i zapreminu koristeći sljedeće
//formule::area = radius * radius * p
//volume = area * length
public class ZapreminasIF {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println( " Unesite duzinu :");
        double duzina = unos.nextDouble();
        System.out.println( " Unesite radius : ");
        double radius = unos.nextDouble();
        double povrsina = radius * radius;
        System.out.println( " Povrsina iznosi : " + povrsina);
        double zapremina = povrsina * duzina;
        System.out.println( " Zapremina iznosi : " + zapremina);
        if ( radius < 0 ){
            System.out.println( "Pogresno ste unijeli broj ");
        }
        else
            povrsina = radius *radius * Math.PI;
        System.out.println( " Povrsina je : " + povrsina);
    }
}
