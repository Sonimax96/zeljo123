package com.company.JaiBoki;

import java.util.Scanner;

public class PrikazGMT {

    public static void main(String[] args) {

        // Dobiti ukupan broj milisekundi od 01. januara 1970.
        long ukupnoMiliSekundi = System.currentTimeMillis();

        // Dobiti ukupan broj sekundi od 01. januara 1970.
        long ukupnoSekundi = ukupnoMiliSekundi / 1000;

        // Izračunati trenutnu sekundu
        long trenutnoSekundi = ukupnoSekundi % 60;

        // Dobiti ukupan broj minuta od 01. januara 1970.
        long ukupnoMinuta = ukupnoSekundi / 60;

        // Izračunati trenutnu minutu
        long trenutnoMinuta = ukupnoMinuta % 60;

        // Dobiti ukupan broj sati od 01. januara 1970.
        long ukupnoSati = ukupnoMinuta / 60;

        // Izraćunati trenutni sat
        long trenutnoSati = ukupnoSati % 24;

        // Prikazati rezultat
        System.out.println("Trenutno GMT vrijeme je: " + trenutnoSati + ":" + trenutnoMinuta + ":" + trenutnoSekundi + " GMT");
    }
}
