package com.company.Predavanje.LekcijaCetiri;

public class Nbroj {
    public static void main(String[] args) {
        int broj=0;

        while (broj*broj<12000){
            broj ++;
        }
        System.out.printf("Ispis " +broj);
    }
}
