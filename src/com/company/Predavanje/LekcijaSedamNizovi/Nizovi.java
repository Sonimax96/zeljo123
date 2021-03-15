package com.company.Predavanje.LekcijaSedamNizovi;

import com.company.AvlijaCode.Scanner.ScanerFunte;

import java.util.Scanner;

public class Nizovi {
    public static void main(String[] args) {
        System.out.println("Unesite niz : ");
       Scanner unos = new Scanner(System.in);
       int duzinaNiza = unos.nextInt();
       double [] nizSlucajnihbrojeva = new double[duzinaNiza];

       for (int i = 0 ; i <duzinaNiza; i++){
           nizSlucajnihbrojeva[i]=Math.random();
       }
        System.out.println(nizSlucajnihbrojeva);


    }
}
