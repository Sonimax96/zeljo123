package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class StringbrojMalihVelikiSlova {
    public static void main(String[] args) {
        Scanner unos =new Scanner(System.in);
        String unoskaraktera= unos.nextLine();
        int brojacVeliki=0;
        int brojacMali=0;

        for (int i=0 ; i < unoskaraktera.length() ; i++){
            if (Character.isUpperCase(unoskaraktera.charAt(i))){
             brojacVeliki++;
            }
            if (Character.isLowerCase(unoskaraktera.charAt(i))){
                brojacMali++;
            }
            System.out.println("Broj veliki slova iznosi : "+brojacVeliki+ " a broj mali iznosi : "+brojacMali);
        }

    }
}
