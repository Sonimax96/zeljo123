package com.company.String;

import java.util.Scanner;

public class Charrazmak {
    public static void main(String[] args) {
        System.out.println("Unesite zeljenu recenicu : ");
        Scanner unos = new Scanner(System.in);

        String prviString = unos.nextLine();
        for (int i= 0 ; i < prviString.length() ; i++) {
            char ch = prviString.charAt(i);
            System.out.print(ch + " ");
        }
    }
}
