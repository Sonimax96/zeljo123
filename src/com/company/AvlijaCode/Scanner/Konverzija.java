package com.company.AvlijaCode.Scanner;

import java.util.Scanner;

public class Konverzija {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite funte : ");
        double funte = unos.nextDouble();

        if (funte<0){
            System.out.println("unjeli ste vrijednost manje od 0 ");
        }
        else {
            double marke = 2.20 * funte;
            System.out.println("Vrijednost funte uBAM je " +marke);
        }
    }
}
