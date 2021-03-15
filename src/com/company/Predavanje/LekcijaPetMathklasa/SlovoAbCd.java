package com.company.Predavanje.LekcijaPetMathklasa;

import java.util.Scanner;

public class SlovoAbCd {
    public static void main(String[] args) {
        System.out.println("Unesite slovo : ");
        Scanner unos = new Scanner(System.in);

        String unosKorsinika = unos.next();


        switch (unosKorsinika){
            case "A" :
                System.out.println("1");
                break;
            case "B" :
                System.out.println("2");
                break;
            case  "C":
                System.out.println("3");
                break;
            case "D":
                System.out.println("4");
                break;
            case "F":
                System.out.println("5");
                break;
        }
    }
}
