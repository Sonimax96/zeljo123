package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class PapirMakaze {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite od 1-3 : ");
        int mojUnos = unos.nextInt();
        int kompijuter = (int) (Math.random() * 3);
        System.out.print(" Kompijuter je ");
        switch (kompijuter) {
            case 0:
                System.out.print("Makaze");
                break;
            case 1:
                System.out.print("Kamen");
                break;
            case 2:
                System.out.print("Papir ");
        }

        System.out.print(" Ti si " + mojUnos);
        switch (mojUnos) {
            case 0:
                System.out.print("Makaze");
                break;
            case 1:
                System.out.print("Kamen ");
                break;
            case 2:
                System.out.print("Papir ");
        }
        if (kompijuter == mojUnos)
            System.out.println(" Nerijeseno");
        else {
            boolean pobjeda = (mojUnos == 1 && kompijuter == 3) ||
                    (mojUnos == 2 && kompijuter == 1) ||
                    (mojUnos == 3 && kompijuter == 2);
            if (pobjeda)
                System.out.println(" Pobjedio si ");
            else
                System.out.println("Izgubio  si");
        }
    }
}