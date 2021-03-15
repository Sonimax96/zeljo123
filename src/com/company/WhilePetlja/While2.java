package com.company.WhilePetlja;

public class While2 {
    public static void main(String[] args) {
        int suma = 0, i = 1;
        while (i < 10) {
            suma = suma + i;
            i++;
        }
        System.out.println("Suma prvih brojeva je : " + suma);
    }
}