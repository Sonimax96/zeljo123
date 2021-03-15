package com.company.Predavanje.LekcijaMetode;

import java.util.Scanner;

public class BrojdanaUgodini {
    public static void main(String[] args) {
        System.out.println("Unesite godinu : ");
        Scanner unos = new Scanner(System.in);
        int unosGOdina= unos.nextInt();
        int godina = brojDanaUgodini(unosGOdina);
        System.out.println("Broj dana u "+unosGOdina+ " godini je " +godina +" dana");
    }

    public static int brojDanaUgodini(int godina) {
        if (godina % 4 == 0 || godina % 400 == 0 & godina % 100 != 0) {
            return 366;
        } else return 365;
    }
}