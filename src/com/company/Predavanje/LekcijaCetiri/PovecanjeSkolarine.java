package com.company.Predavanje.LekcijaCetiri;

public class PovecanjeSkolarine {
    public static void main(String[] args) {
        double skolarina = 5000;
        final double porez = 1.07; //procenat 7%
        double duplanjeSkolarine=10000; // skolarina * 2
        int godina = 0;

        while (skolarina<=duplanjeSkolarine){        //kod while petelje se vrti sve dok ne ispuni uslov a kod if petlje samo jednom
            skolarina*=porez;
            godina++;
        }
        System.out.println("Skolarina ce se uduplati za "+godina+ " godina ");
    }
}
