package com.company.Predavanje.LekcijaTri;

import java.util.Scanner;

/* Predpostavimo da kupujemo rizu u dva razlicita pakovanja.
Napisi Program koji ce uporedjivati cijene kostanja.
Program omogucava korisniku da unese tezinu i cijenus vakog pakovanja i da nma preporuku koji je povoljniji
Unesite tezinu i cijenu za pakvanje br 1 : 50  24,59
Unesite tezinu i cijenu 2 pakovanja : 25 11,99
 */
public class Riza {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite tezinu pakovanja : ");
        double tezinaPrvog = unos.nextDouble();
        System.out.println(" Unesite cijenu pakovanja: : ");
        double cijenaPrvog = unos.nextDouble();
        System.out.println(" Unesite tezinu 2 paketa : ");
        double tezinaDrugog = unos.nextDouble();
        System.out.println(" Unesite cijenu 2 paketa : ");
        double cijenaDrugog = unos.nextDouble();
        double prviPaket = cijenaPrvog / tezinaPrvog;
        double drugiPaket = cijenaDrugog / tezinaDrugog;
        System.out.println("Prvi paket je " + prviPaket + " a drugi paket je " + drugiPaket);
        if (prviPaket < drugiPaket || drugiPaket > prviPaket) {
            System.out.println(" Prvi paket je jeftiniji ! " +prviPaket);
        }
        else
            System.out.println(" Drugi paket je jeftiniji " + drugiPaket);
        }
    }
