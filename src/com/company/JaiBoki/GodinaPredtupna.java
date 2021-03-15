package com.company.JaiBoki;
/* Napisati program koji pita korisnika da unese godinu. Nakon Ĺˇto korisnik unese godinu,
ako je unesena godina validna program provjerava da li je unesena godina prestupna,
te ispisuje korisniku da li je godina prestupna.


Godina je prestupna ukoliko je djeljiva sa 4 ali ne sa 100 ili ako je djeljiva sa 400.*/

import java.util.Scanner;

public class GodinaPredtupna {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite broj godina : ");
        int godina = unos.nextInt();
        if (godina % 4 == 0 || godina % 400 == 0 && godina % 100 != 0) {
            System.out.println(godina + " godina je prestupna");
        } else {
            System.out.println(godina + " godina nije prestupna ");
        }
    }
}
