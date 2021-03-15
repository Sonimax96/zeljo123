package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

public class TextSoace {
    public static void main(String[] args) {
        System.out.println("Unesite neki string : ");
        Scanner unos = new Scanner(System.in);

        String prviUnos = unos.nextLine();

        for (int i = 0 ; i < prviUnos.length() ; i ++){
            char ch = prviUnos.charAt(i);
            System.out.print (ch + " ");
        }
    }
}
