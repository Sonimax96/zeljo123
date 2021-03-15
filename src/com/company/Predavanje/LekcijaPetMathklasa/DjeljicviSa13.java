package com.company.Predavanje.LekcijaPetMathklasa;

import java.util.Scanner;

public class DjeljicviSa13 {
    public static void main(String[] args) {
            Scanner unos = new Scanner(System.in);
            System.out.println("Unesite cjeli broj : ");
            int unosBroj = unos.nextInt();

            for (int broj=1 ; broj<unosBroj ; broj++){
                if (broj % 13==0){
                    System.out.print(" " + broj );
                }
            }
    }
    }

