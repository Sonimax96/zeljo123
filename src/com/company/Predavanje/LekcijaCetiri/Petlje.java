package com.company.Predavanje.LekcijaCetiri;

import java.util.Scanner;
// Napisati program koji pita korisnika da unosi cijeli broj sve dok korisnik ne unese 0.
// Kada korisnik unese nulu,program ispisuje zbir svih unesenih brojeva,
// prosjek svih unesenih brojeva te zavrsava s radom
public class Petlje {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite broj :");
        int unosOdStraneKorisnika = -1;
        int zbirUnesenihBrojeva = 0;
        double prosjek = 0;
        int brojac = -1;
        while (unosOdStraneKorisnika != 0) {
            unosOdStraneKorisnika = unos.nextInt();
            zbirUnesenihBrojeva = unosOdStraneKorisnika + zbirUnesenihBrojeva;
            brojac ++ ; //brojac + 1 ;
        }
        System.out.println(" Zbir unesenih brojeva  " + zbirUnesenihBrojeva);
        prosjek = (double) zbirUnesenihBrojeva / brojac;
        System.out.println(" Prosjek je : " + prosjek);

    }
}