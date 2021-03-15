package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class PrimeMethod6_10 {
    public static void main(int args) {
        int prostBroj=0;
        for (int i =0 ; i <10000; i++){
            if (prostBroj(i+1)){
                System.out.print((i+1)+ " ");
                prostBroj++;
                if (prostBroj%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("Prost broj je "+prostBroj);
    }
    private static boolean prostBroj (int broj) {
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {

                return false;
            }
        }

   return true;
    }
}


