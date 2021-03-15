package com.company.Predavanje.LekcijaCetiri;

public class NbrojnaTrecu {
    public static void main(String[] args) {
        int broj=0;

        while (broj*broj*broj<12000){
            broj++;
        }
        System.out.println("Ispis " +broj);
    }
}
