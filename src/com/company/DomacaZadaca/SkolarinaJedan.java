package com.company.DomacaZadaca;
/*Predpostavimo da školarina na fakultetu iznosi BAM10,000 ove godine i raste 5% svake gosine.
        U prvoj godini školarina će biti: BAM 10,500.
        Napišite program koji će nam izračunti školarinu za 10u godinu,
        a potom ispisati i totalnu cijenu za 4 godine koštanja školarine poslije 10 godina.


        Ja sam dobio ovaj rezult:
        - školarinu u 10oj godini: 16288.946267774418
        - cjena skolarine zadnje 4 godine = 73717.76425901079 */
public class SkolarinaJedan {
    public static void main(String[] args) {
        int skolarina = 10000;
        double godisnjaKamata = 0.05;
        double ukupnaskolarina = 0;
        double skolarinaDesetGodina = 0;

        for (int i = 1; i <= 14; i++) {
            skolarina += (skolarina * godisnjaKamata);

            if (i > 10 ) {
                ukupnaskolarina += skolarina;
            }
            if (i == 10) {
                skolarinaDesetGodina += skolarina;

            }
        }
        System.out.println("Skolarina za desetu godinu iznosi : " + skolarinaDesetGodina);
        System.out.println("Ukupna skolarina iznosi : " + ukupnaskolarina);
    }
}
