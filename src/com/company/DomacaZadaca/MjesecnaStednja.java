package com.company.DomacaZadaca;

import java.time.Month;
import java.util.Scanner;

// Predpostavimo da uštedimo $100 svaki mjesec na svoj štedni račun, sa godišnjom kamatnom stopom: 5%.
//
//       Prema tome mjesečna kamatna stopa se dobije :
//               0.05/12 = 0.00417.
//
//       Nakon isteka prvog mjeseca, vrjednost na računu postaje:
//               100 * (1 + 0.00417) = 100.417
//       Nakon isteka drugog mjeseca, vrjednost na računu postaje:
//               (100 + 100.417) * (1 + 0.00417) = 201.252
//       Nakon isteka trećeg mjeseca, vrjednost na računu postaje:
//               (100 + 201.252) * (1 + 0.00417) = 302.507
//       I tako dalje..
//
//       Omogućite korisniku da unese koliko mjesečno uštedi,
//        a vi mu izračunajte koliku će vrjednost imati nakon šestog mjeseca.
public class MjesecnaStednja {

    public static void main(String[] args) {
        final double MJESECNA_KAMATNA_STOPA = 0.00417;
        Scanner unos =new Scanner(System.in);
        System.out.println( "Unesite mjesecnu stednju : ");
        double mjesecnaUsteda = unos.nextDouble();
        double mjesec= 100 * ( 1 + MJESECNA_KAMATNA_STOPA);
        mjesec = ( mjesecnaUsteda + mjesec) * ( 1 + MJESECNA_KAMATNA_STOPA);
        mjesec = ( mjesecnaUsteda + mjesec) * ( 1 + MJESECNA_KAMATNA_STOPA);
        mjesec = ( mjesecnaUsteda + mjesec) * ( 1 + MJESECNA_KAMATNA_STOPA);
        mjesec = ( mjesecnaUsteda + mjesec) * ( 1 + MJESECNA_KAMATNA_STOPA);
        mjesec = ( mjesecnaUsteda + mjesec) * ( 1 + MJESECNA_KAMATNA_STOPA);
        System.out.println("  Ispis ustede : " + mjesec );


    }
}
