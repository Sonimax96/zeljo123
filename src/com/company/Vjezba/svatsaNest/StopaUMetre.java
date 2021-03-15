package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class StopaUMetre {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print( " Unesite broja stopa : ");
        double brojStopa=unos.nextDouble();
        double metar = unos.nextDouble();
        metar = brojStopa * 0.305;
        System.out.println(brojStopa + " stopa iznosi " + metar + " m ");
    }
}
