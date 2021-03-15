package com.company.JaiBoki;

import java.util.Scanner;

public class ProsjekIzracunaj {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunaj prosjek tri broja : ");
        int broj1 = unos.nextInt();
        int broj2 = unos.nextInt();
        int broj3 = unos.nextInt();

        int prosjek = (broj1 + broj2 + broj3) / 3 ;
        System.out.println("Prosjek tri broja je : " + prosjek);

    }
}
