package com.company.String;

import java.util.Scanner;

public class Djeljivost {
    public static void main(String[] args) {
        System.out.println("Unesite zeljenu vrijednost : ");
        Scanner unos = new Scanner(System.in);

        int unosBroja = unos.nextInt();
        for (int i = 1 ; i < unosBroja ; i++) {
            if (i % 13 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
