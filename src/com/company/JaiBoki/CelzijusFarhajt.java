package com.company.JaiBoki;

import java.util.Scanner;

public class CelzijusFarhajt {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int c ;
        int f ;
        System.out.println("Unesite stepene C : ");
        c = unos.nextInt();
        f = 9*c / 5 + 32 ;
        System.out.println( " Broj celzijusa " + c + " iznosi " + f + " F" ) ;

    }
}
