package com.company.Predavanje.LekcijaMetode;

import java.util.Scanner;

public class VelikaSlova {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        String prviKarakter="unos.nextLine()";
        int brojacVelikiSlova=0;
        int bbrojacMalislova=0;
        for (int i =0 ; i<prviKarakter.length() ; i++) {
        if (Character.isUpperCase(prviKarakter.charAt(i))){
            brojacVelikiSlova++;
        }
        if (Character.isLowerCase(prviKarakter.charAt(i))){
            bbrojacMalislova++;
        }
            System.out.println(brojacVelikiSlova+ " velika slova " + " mal slova " +bbrojacMalislova);
        }

    }
}
