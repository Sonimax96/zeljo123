package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class FanhrajtC {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double stepeniCelzijusa;
        double stepeniFanhrajt;
        System.out.println(" Unesite stepeni C : ");
        stepeniCelzijusa=unos.nextDouble();
        stepeniFanhrajt = (9.0 / 5.0 ) * stepeniCelzijusa + 32;
        System.out.println( stepeniCelzijusa+ " stepeni C iznosi " + stepeniFanhrajt+ ( "F" ));

    }
}
