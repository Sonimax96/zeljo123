package com.company.Predavanje.LekcijaCetiri;

import java.util.Scanner;

public class PetljaDva {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int prviBroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        int rezultat = prviBroj - drugiBroj;
        System.out.println("Zadatak : " + prviBroj + " - " + drugiBroj + " ? ");
        int korisnik = unos.nextInt();

        while (korisnik != rezultat){
            System.out.println(" Zao nam je unijeli ste pogresan rezultat,pokusajte ponovo");
            System.out.println(" Zadatak : " + prviBroj + " - " +drugiBroj + " ? ");
            korisnik=unos.nextInt();
        }
        System.out.println( " cestitamo,Vam pogodili ste rezultat ");
        unos.close();
    }
}


