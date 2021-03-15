package com.company.DomacaZadaca;

import java.util.Scanner;

public class ManjeiliVise {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite cjeli broj : ");
        int korisnik = unos.nextInt();
        int racunar = (int) (Math.random() * 1000);

        do {
            if (korisnik < racunar)
            {
                System.out.println("Unjeli ste manji broj,upisite veci.");
                System.out.println(" Upisite vas cjeli broj : ");
                korisnik = unos.nextInt();
            }
            if (korisnik > racunar) {
                System.out.println("Unjeli ste veci broj,upisite manji ");
                System.out.println(" Upisite vas cjeli broj : ");
                korisnik = unos.nextInt();
            }
        }
            while (korisnik != racunar) ;
            System.out.println("Broj racunara je " + racunar + " pogodili ste broj");
        }
    }
