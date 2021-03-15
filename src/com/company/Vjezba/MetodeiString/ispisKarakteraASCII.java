package com.company.Vjezba.MetodeiString;

public class ispisKarakteraASCII {
    public static void main(String[] args) {
        ispisiKaraktera('H', 'h', 10);
    }

    private static void ispisiKaraktera(char k1, char k2, int brojLinija) {
        int brojac = 0;
        for (int i = k1; i <= k2; i++) {
            System.out.print((char) i);
            brojac++;
            if (brojac == brojLinija) {
                System.out.println();
                brojac = 0;
            }
        }
    }
}