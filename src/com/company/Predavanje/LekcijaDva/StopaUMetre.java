package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

public class StopaUMetre {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        final double brojStopa;
        double metar;
        System.out.println( " Unesite broj stopa : ");
        brojStopa= unos.nextDouble();
        metar = brojStopa * 0.305;
        System.out.println (brojStopa + " stopa iznosi " +metar + " metara");


    }
}
