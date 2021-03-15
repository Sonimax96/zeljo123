package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

// switch gdje prosledjujemo suvi tip podatka sta mi njemu prosedjujemo
// case primjer case 1: {}
//break samo taj dio linije da nam odradi
//default ispis u slucaju ako nema unesenog broja npr. unesemo 10 aimamo od 1-7
// else if cim naidje na prvi uslov on njega ispisuje
public class Prekidac {
    public static void main(String[] args) {
        Scanner unos = new Scanner( System.in);
        System.out.println( " Unesite broj : ");
        int dan = unos.nextInt();
        switch (dan) {
            case 1: {
                System.out.println( " Ponedeljak");
            }
        }

    }
}
