package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class Zadatak6_1pentagon {
    public static void main(String[] args) {
        System.out.println("prvih 100 brojeva : ");
        for (int i = 1; i <= 100; i++) {
            System.out.printf(" " + PentagonBroj(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int PentagonBroj(int n){
        return (n * (3 * n - 1)) / 2;
    }
}