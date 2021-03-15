package com.company.WhilePetlja;

import java.util.Scanner;

public class PonavljanjemodulaOperatora {
    public static void main(String[] args) {
        System.out.println("Unesite vrijednost krajnje granice : ");
        Scanner unos = new Scanner(System.in);

        int vrijednost = unos.nextInt();
        System.out.println("brojevi djeljivi sa 13 u rasponu od  1 " + vrijednost + " su :");

        for(int i =1 ; i<=vrijednost ; i++){
            if (i % 13 == 0 ){
                System.out.println(i+ " ");

            }

        }
    }
}
