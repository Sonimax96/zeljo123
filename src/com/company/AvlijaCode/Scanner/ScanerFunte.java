package com.company.AvlijaCode.Scanner;

import java.util.Scanner;

public class ScanerFunte {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite funte : ");
        double funte=unos.nextDouble();

        double marke=2.20 * funte;
        System.out.println("To je " + marke +" KM ");
    }
}
