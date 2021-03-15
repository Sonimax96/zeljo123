package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class Ocjenechar {
    public static void main(String[] args) {
        System.out.println("Unesite ocjenu : ");

        Scanner unos = new Scanner(System.in);
        String ocjena = unos.next();

        char ocjenaChar = ocjena.charAt(0);

        switch (ocjenaChar) {
            case 'A' : System.out.println("ocjena 5 " ); break;
            case 'B' : System.out.println("ocjena 4 " ); break;
            case 'C' : System.out.println("ocjena 3 " ); break;
            case 'D' : System.out.println("ocjena 2 " ); break;
            case 'E' : System.out.println("ocjena 1 " ); break;
        }
            System.out.println("Pogresan unos ");

    }
}
