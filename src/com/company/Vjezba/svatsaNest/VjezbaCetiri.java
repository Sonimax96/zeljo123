package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

// One pound is 0.454 kilograms
public class VjezbaCetiri {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Unesite cifru :");
        double pound = unos.nextDouble();
        double kilogram;
        kilogram = pound * 0.454;
        System.out.println( pound + " pound ima  " + kilogram + "kg");
    }
}
