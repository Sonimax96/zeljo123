package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class metodaremoveChar {
    public static void main(String[] args) {
        System.out.println("Unesite String : ");
        Scanner unos = new Scanner(System.in);
        String rijec=unos.next();

        System.out.println("Unesite karakter : ");
        String karakter = unos.next();
        char ch = karakter.charAt(0);
        String noviString =removeCharString(rijec,ch);
        System.out.println("Novi izmjenjeni string je " + noviString);
    }
    public  static String removeCharString (String rijec ,char ch){
        char[] nizKaratkera=rijec.toCharArray();
        int zadnjeslovo= nizKaratkera.length -1;
        nizKaratkera[zadnjeslovo]=ch;
        String noviString = " ";
        for (int i=0 ; i<nizKaratkera.length ; i++){
            noviString+=nizKaratkera[i];
        }
        return  noviString;
    }
}
