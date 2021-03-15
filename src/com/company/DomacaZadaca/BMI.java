package com.company.DomacaZadaca;

import java.util.Scanner;

/*BMI    								Intepretacija
        BMI < 18.5    					Pothranjenost
        18.5 ≤ BMI < 25.0    			Normalan BMI
        25.0 ≤ BMI < 30.0    			Gojaznost
        30.0 >= BMI    					Pretilost
        Formula za izračunavanje BMI-a: 		težina / (visina * visina)
        */
public class BMI {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double BMI ;
        System.out.println(" Unesite tezinu : ");
        double tezina = unos.nextDouble();
        System.out.println("Unesite visinu : ");
        double visinu = unos.nextDouble();
        BMI =  tezina / (visinu * visinu);
        int BMII = (int) BMI;
        if (BMII < 18.5) {
                System.out.println("Pothranjenost : " + BMII + " < 18,5 ");
        }
        if (18.5 <= BMII && BMII < 25.0) {
            System.out.println("Normalan BMI : 18,5 <= " + BMII + " < 25,0");
        }
        if (25.0 <= BMII && BMII < 30.0) {
            System.out.println("Gojazsnost : 25,0 <= " + BMII + " < 30,0");
        }
        if (30.0 <= BMII) {
            System.out.println("Smrsaj KONJU : 30,0 <: " + BMII );
        }
        System.out.println( " Vas BMI iznosi : " + BMI);
    }
}