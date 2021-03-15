package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// Napišite program koji čita u radijusu
//i dužinu cilindra i izračunava površinu i zapreminu koristeći sljedeće
//formule::area = radius * radius * p
//volume = area * length
public class ZapreminaiPovrsina {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print(" Unesite radius i duzinu u cm : ");
        double radius = unos.nextDouble() ;
        double duzinu = unos.nextDouble() ;
        double povrsina = radius * radius * Math.PI;
        double zapremina = povrsina * duzinu;
        System.out.println( " Povrsina iznosi " +povrsina + " cm" );
        System.out.println(" Zapremina iznosi " + zapremina + " cm ");
        }

    }

