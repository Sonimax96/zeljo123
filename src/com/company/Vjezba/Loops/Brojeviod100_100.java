package com.company.Vjezba.Loops;

public class Brojeviod100_100 {
    public static void main(String[] args) {
        String ispis = " ";
        System.out.println("Ispis brojeva od 100 - 1000,djeljivi sa 5 i 6  : ");
        int brojac=0;
        for (int i =100 ; i <=1000 ; i++){
            if (i % 5==0 & i%6==0){
                System.out.print(" " +i);
                brojac++;
            }
            if (brojac == 10){
                System.out.println();
                brojac=0;
            }
        }
    }
}
