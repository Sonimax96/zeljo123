package com.company.DomacaZadaca;

public class Bacanjekovanice {
    public static void main(String[] args) {
        int brojacPisma = 0;

        for (int i = 0; i < 100000000; i++) {

            int kovanica = (int) (Math.random() * 2);
            if (kovanica == 0) {
                brojacPisma++;
            }
        }
        System.out.println("Pismo je " + brojacPisma + " puta");
        System.out.println("Glava je " + (100000000 - brojacPisma) + " puta");
    }
}
