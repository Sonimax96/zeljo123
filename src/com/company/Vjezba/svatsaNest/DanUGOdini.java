package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class DanUGOdini {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite dan u mjesecu : ");
        int danMjeseca = unos.nextInt();
        System.out.println(" Unesite mjesec : " );
        int mjesec = unos.nextInt();
        System.out.println(" Unesite vijek : ");
        int vijek = unos.nextInt();
        System.out.println(" Unesite godinu : ");
        int godina = unos.nextInt();
        if (mjesec == 1 || mjesec == 2) {
            mjesec = (mjesec == 1) ? 13 : 14;
            godina--;
        }
        int danSedmice = (danMjeseca + 26 * (mjesec + 1) / 10 + godina + godina / 4 + vijek / 4 + 5 * vijek) % 7;
        switch (danSedmice) {
            case 0:
                System.out.println("Subota ");
                break;
            case 1:
                System.out.println(" Nedelja ");
                break;
            case 2:
                System.out.println("Ponedeljak");
                break;
            case 3:
                System.out.println(" Utorak ");
                break;
            case 4:
                System.out.println(" Srijeda ");
                break;
            case 5:
                System.out.println(" Cetvrtak ");
                break;
            case 6:
                System.out.println(" Petak ");
                break;
        }
    }
}
