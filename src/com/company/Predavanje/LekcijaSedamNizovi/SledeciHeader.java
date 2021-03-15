package com.company.Predavanje.LekcijaSedamNizovi;

public class SledeciHeader {
    public static void main(String[] args) {
        String ime = "Zeljo 7";
        String cistoIme = removeChar(ime, '7');
        System.out.println(cistoIme);
    }

    public static String removeChar(String str, char ch) {
        String ispis = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ispis += str.charAt(i);
            }
        }

        return ispis;
    }

}
