package com.company.Vjezba.MetodeiString;

public class IspiosiKarakterapoLiniji {
    public static void main(String[] args) {
        IspisiKaraktera('a', 'z', 6);
    }

    public static void IspisiKaraktera(char pocetnikarakter, char zavrsnikarakter, int brojLinija) {
        int brojac = 0;

        for (char i = pocetnikarakter; i <= zavrsnikarakter; i++) {
            brojac++;
            System.out.print(" " + i);

            if (brojac == brojLinija) {
                System.out.println();
                brojac = 0;
            }
        }
    }
}
