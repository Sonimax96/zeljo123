package com.company.Vjezba.Loops;

import java.awt.geom.PathIterator;
import java.util.Scanner;

public class Brojac {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int brojacPisma=0;

        for (int i =0 ; i <=1000000 ; i++){
            int kovacnica=(int)(Math.random()*2);
            if (kovacnica==0){
                brojacPisma++;
            }
        }
        System.out.println("Pismo je palo " + brojacPisma);
        System.out.println("Na glavu je palo " + (1000000-brojacPisma) + " puta ");
    }
}
