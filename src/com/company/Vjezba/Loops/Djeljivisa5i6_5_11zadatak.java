package com.company.Vjezba.Loops;

public class Djeljivisa5i6_5_11zadatak {
    public static void main(String[] args) {
        int brojac =0;
        String ispis = " ";

        for (int i=100 ; i <=200 ; i++){
        if (i % 5 ==0 || i % 6==0){
            System.out.print(" "+i);
            brojac++;
        }
        if (brojac==10){
            System.out.println();
            brojac=0;
        }
        }
    }
}
