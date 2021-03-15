package com.company.WhilePetlja;

public class Break {
    public static void main(String[] args) {
        int suma = 0;
        int broj = 0;

        while (broj < 20) {
            suma += broj;
            broj++;

            if (suma >= 100) {
                break;
            }
        }
        System.out.println("Suma je " + suma);
        System.out.println(" broj je " + broj);
    }
}