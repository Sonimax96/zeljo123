package com.company.DomacaZadaca;

import java.util.Scanner;

public class Chapter5KilogramuPoundsiObrnuto {
    public static void main(String[] args) {
        final double Razlika = 1.609;
        System.out.println(" ispis kilograma vs pounds : ");

        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j+= 5) {
            System.out.println(i + "               " + (i * Razlika) + "  |  " + j + "       " + (j / Razlika));
        }
    }
}