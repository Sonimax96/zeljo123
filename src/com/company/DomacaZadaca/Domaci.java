package com.company.DomacaZadaca;

import java.util.Scanner;

public class Domaci {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Zadatak : ");
        int prvibroj = (int) (Math.random() * 10) + 1;
        int drugiBroj = (int) (Math.random() * 10) + 1;
        System.out.println(+prvibroj + " - " + drugiBroj + " ? ");
        int rezultat = prvibroj - drugiBroj;
        int odgovor = unos.nextInt();

        System.out.println("Rezultat je : " + rezultat);
        System.out.println("Rezultat ne moze biti negativan ! ");

        int rezultatJedan = drugiBroj - prvibroj;
        if (drugiBroj>prvibroj){
            System.out.println(+ drugiBroj +" - " + prvibroj + " = "+rezultatJedan );
        }
        }
    }

