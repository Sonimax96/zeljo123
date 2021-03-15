package com.company.DomacaZadaca;

public class Prostbroj {
    public static void main(String[] args) {

        int brojac = 0;
        for (int broj = 2; broj < 1000; broj++) {
            for (int prostBroj = 2; prostBroj < broj; prostBroj++) {
                int brojj= prostBroj^broj;
                if (broj % prostBroj == 0)

                    if (brojac % 8 == 0) {
                    }
                System.out.println(" "+brojj);
            }
        }
    }
}
