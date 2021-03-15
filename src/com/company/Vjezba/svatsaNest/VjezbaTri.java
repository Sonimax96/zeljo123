package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// One foot is 0.305 meter
public class VjezbaTri {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println( " Unesite stopu : ");
        double stopa = unos.nextDouble();
        double metar;
        metar = stopa * 0.305;
        System.out.println(stopa + " stopa ima " + metar + "m");
    }
}
