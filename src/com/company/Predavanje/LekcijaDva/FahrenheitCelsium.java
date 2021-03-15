package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

public class FahrenheitCelsium {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double temperaturaCelzijusa;
        double temperaturaFahrajt;
        System.out.println(" Unesite stepene Celsiusa : ");
        temperaturaCelzijusa =unos.nextDouble();
        temperaturaFahrajt = ( 9.0 / 5.0) * temperaturaCelzijusa + 32 ;
        System.out.println( temperaturaCelzijusa+ " Stepeni Celsiusa "
                + " iznosi u Fahrenheit-u " + temperaturaFahrajt + " F ");
    }

}
