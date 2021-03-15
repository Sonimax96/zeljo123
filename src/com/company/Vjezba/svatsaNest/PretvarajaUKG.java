package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class PretvarajaUKG {
    public static void main(String[] args) {
        double kiloGram;
        double pounds;
        Scanner unos = new Scanner(System.in);
        System.out.println( "Unesite velicinu u pound-s : ");
        kiloGram =unos.nextDouble();
        pounds = kiloGram * 0.454;
        System.out.println( "Iznosi " + pounds + " u kilogramima ");
    }
}
