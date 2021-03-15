package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// area = radius * radius * p
//volume = area * length
public class VjezbaDva {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println( " Unesite radius i duzinu : ");
        double radius = unos.nextDouble();
        double povrsina;
        double duzina = unos.nextDouble();
        double zapremina ;
        povrsina = radius * radius * Math.PI;
        zapremina = povrsina * duzina;
        System.out.println( " Povrsina iznosi " + povrsina + " a zapremina iznosi " + zapremina );

    }
}
