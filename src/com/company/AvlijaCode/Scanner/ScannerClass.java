package com.company.AvlijaCode.Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite prvi broj : ");
        int prviBroj= unos.nextInt();

        System.out.println("Unesite drugi broj :");
        int drugiBroj=unos.nextInt();

        int rezultat= prviBroj + drugiBroj;
        System.out.println(prviBroj + " + " +drugiBroj + " = " +rezultat);

    }
}
