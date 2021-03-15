package com.company.Predavanje.LekcijaMetode;

public class IspisiKaraktera {
    public static void main(String[] args) {
        ispisKaraktera('a', 'z', 6);

    }

    public static void ispisKaraktera(char pocetniKarakter, char zavrsniKarakter, int brojPoliniji) {
        int brojac = 0;
        for (char i = pocetniKarakter; i <= zavrsniKarakter; i++) {
            brojac++;
            System.out.print(" " + i);
            if (brojac == brojPoliniji) {
                System.out.println();
                brojac=0;
            }
        }
    }
}
