package com.company.Predavanje.LekcijaMetode;

public class ZbirBrojeva6_2 {
    public static void main(String[] args) {
        int prvaSuma= sabiranjeBrojeva(999);
        int drugaSuma=sabiranjeBrojeva(234);
        System.out.println("Zbir brojeva unutar cifre je : " +prvaSuma);
        System.out.println("Zbir brojev aunutar cifre je : "+drugaSuma);
    }
    public static int sabiranjeBrojeva(long broj){
        long sumaBrojeva=0;
        while (broj>0){
            long poslednjaCifra=broj%10;
            sumaBrojeva+=poslednjaCifra;
            broj = broj/10;
        }
        return  (int)sumaBrojeva;
    }
}
