package com.company.String;

import java.util.Scanner;

public class Dvagrada {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite prvi grad : ");
        String gradJedan= unos .nextLine();
        System.out.println("Unesite drugi grad : ");
        String gradDva = unos .nextLine();

        if (gradJedan.compareTo(gradDva)<0)
            System.out.println("Gradovi po Azbuci su " +gradJedan +" "+gradDva);

        else System.out.println("gradovi po azbuci su " +gradDva + " " +gradJedan);
    }
}
