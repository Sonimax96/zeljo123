package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class BrojeviDjeljivis13 {
    public static void main(String[] args) {
        System.out.println("Unesite vrijednost : ");
        Scanner unos = new Scanner(System.in);

        int vrijednost = unos.nextInt();

        System.out.println("Brojevi djeljivi sa 13 u rasponu od 1 do "+vrijednost + "su : ");
        for (int i =1 ; i <=vrijednost ; i ++){
            if ( i % 13== 0 ){
                System.out.print(i + " ");
            }

        }
    }
}
