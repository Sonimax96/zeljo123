package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// fahrenheit = (9 / 5) * celsius + 32
public class VjezbaJedan {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite stepeni Celzijusa : ");
        double stepeniCelzijusa= unos.nextDouble();
        double stepeniF= unos.nextDouble();
        stepeniF = ( 9.0 / 5.0) * stepeniCelzijusa + 32;
        System.out.println( stepeniCelzijusa + " stepeni celzijusa iznosi " + stepeniF + "F");
    }
}
