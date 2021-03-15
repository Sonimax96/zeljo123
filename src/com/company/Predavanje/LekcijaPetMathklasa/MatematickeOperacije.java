package com.company.Predavanje.LekcijaPetMathklasa;

import java.util.Scanner;

//string niz karaktera,
public class MatematickeOperacije {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        String prviUnos= unos.nextLine();

        System.out.println(" " +prviUnos.length() + " : karaktera je duzina stringa");
        System.out.println(" " +prviUnos.charAt(0)+ " : prvo slovo ");


    }
}
