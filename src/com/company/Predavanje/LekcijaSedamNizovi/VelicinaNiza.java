package com.company.Predavanje.LekcijaSedamNizovi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VelicinaNiza {
    public static void main(String[] args) {
        System.out.println("Unesite duzina niza  : ");
        Scanner unos = new Scanner(System.in);

        int duzinaNiza = unos.nextInt();
        int[] nizBrojeva = new int[duzinaNiza];
        int maxBroj = nizBrojeva[0];
        int index =0;
        for (int i = 0; i < duzinaNiza; i++) {
            nizBrojeva[i] = unos.nextInt();

            if (nizBrojeva[i] > maxBroj) {
                maxBroj = nizBrojeva[i];
                index = i;
            }
        }
        System.out.println("Najveci broj u nizu je " + maxBroj + " a nalazi se na mjestu " +index);
    }
}