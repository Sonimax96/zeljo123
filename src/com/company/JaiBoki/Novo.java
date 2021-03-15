package com.company.JaiBoki;

import java.util.Scanner;

public class Novo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite tri broja");
        double broj1 = unos.nextDouble();
        double broj2 = unos.nextDouble();
        double broj3 = unos.nextDouble();
        double iznos = ( broj1 + broj2 + broj3 ) / 3 ;
        System.out.println("Zbir tri broja " + broj1 + " " + broj2 + " " + broj3 + " is " + iznos);

    }
}