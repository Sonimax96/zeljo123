package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class Brojdana {
    public static void main(String[] args) {
        System.out.println("unesite godinu : ");
        Scanner unos = new Scanner(System.in);
        int godina = unos.nextInt();
        int brojDanauGodini = brojDanauGodini(godina);
        System.out.println("Broj dana u unesenoj godini je " + brojDanauGodini);
    }

    public static int brojDanauGodini(int broj) {
        if ((broj % 4 == 0 && broj / 100 != 0) || (broj % 400 == 0)) {
            return 366;
        }
        else return  365;
    }
}
