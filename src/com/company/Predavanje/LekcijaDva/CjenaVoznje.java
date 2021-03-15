package com.company.Predavanje.LekcijaDva;

import java.util.Scanner;

public class CjenaVoznje {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double distanca;
        double potrosnjaGoriva;
        double cjenaGoriva;
        double cjenaVoznje;
        System.out.print("Unesite distancu : ");
        distanca = unos.nextDouble();
        System.out.print("Potrosnja goriva :");
        potrosnjaGoriva = unos.nextDouble();
        System.out.print( " Cjena goriva : ");
        cjenaGoriva = unos.nextDouble();
        cjenaGoriva= distanca * (potrosnjaGoriva / 100) * cjenaGoriva;
        System.out.println(" Cjena voznje iznosi  " + cjenaGoriva + " KM " );

    }
}
