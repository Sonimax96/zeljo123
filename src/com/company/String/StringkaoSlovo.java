package com.company.String;

import java.util.Scanner;

public class StringkaoSlovo {
    public static void main(String[] args) {
        System.out.println("Unesite slovo kako bi vam izbacilo ocjenu : ");
        Scanner unos = new Scanner(System.in);

        String slovo = unos.next();
        char broj = slovo.charAt(0);
        switch (broj){
            case 'A' : System.out.println("ocjena 5 "); break;
            case 'B' : System.out.println("ocjena 4 "); break;
            case 'C' : System.out.println("ocjena 3 "); break;
            case 'D' : System.out.println("ocjena 2 "); break;
            case 'E' : System.out.println("ocjena 1 "); break;
            default: System.out.println("Pogresan unos");
        }
    }
}
