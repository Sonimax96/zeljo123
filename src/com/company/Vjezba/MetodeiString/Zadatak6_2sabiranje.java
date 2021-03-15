package com.company.Vjezba.MetodeiString;

public class Zadatak6_2sabiranje {
    public static void main(String[] args) {
        int prvacifra=sabiranjeBrojeva(234);
        int Drugacifra=sabiranjeBrojeva(999);
        System.out.println("prvacifra = " + prvacifra);
        System.out.println("Drugacifra = " + Drugacifra);
    }

    public static int sabiranjeBrojeva(long broj) {
        long sumaBrojeva = 0;
        while (broj > 0) {
            long posljednjaCifra = broj % 10;
            sumaBrojeva += posljednjaCifra;
            broj = broj / 10;
        }
        return (int)sumaBrojeva;
    }
}
