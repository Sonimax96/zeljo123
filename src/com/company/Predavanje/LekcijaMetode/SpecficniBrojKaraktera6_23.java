package com.company.Predavanje.LekcijaMetode;

public class SpecficniBrojKaraktera6_23 {
    public static void main(String[] args) {

    }

    public static int brojacSlova(String str, char a) {
        int brojac = 0;

        for (int i = 0; i < str.length(); i++) {

            a = str.charAt(i);

            brojac++;
        }
        return brojac;
    }
}

