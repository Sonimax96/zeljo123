package com.company.Predavanje.LekcijaSedamNizovi;

import java.util.Scanner;

public class IndexNajmanjegElementa {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int minElement[] = new int[unos.nextInt()];
        System.out.println("Unesite 10 elemenata : ");
        for (int i = 0; i < minElement.length; i++) {
            minElement[i] = unos.nextInt();
        }
        indexNajmanjegElementa(minElement);
        System.out.println("Index najmanjeg elementa u nizu je " + indexNajmanjegElementa(minElement));
    }

    public static int indexNajmanjegElementa(int[] array) {
        int ineex = 0;
        int najmanjiLement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (najmanjiLement > array[i]) {
                 najmanjiLement=array[i];
                ineex = i;
            }
        }
        return ineex;
    }
}
