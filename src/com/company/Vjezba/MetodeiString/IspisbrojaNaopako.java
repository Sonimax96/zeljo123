package com.company.Vjezba.MetodeiString;

public class IspisbrojaNaopako {
    public static void main(String[] args) {
        naopakoMetoda(3456);

    }

    private static void naopakoMetoda(int broj) {
        while (broj != 0) {
            int red = broj % 10;
            System.out.print(red);
            broj = broj / 10;
        }
    }
}

