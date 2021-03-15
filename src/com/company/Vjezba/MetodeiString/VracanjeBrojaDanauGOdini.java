package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class VracanjeBrojaDanauGOdini {
    public static void main(String[] args) {
        System.out.println("Unesite godinu : ");
        Scanner unos = new Scanner(System.in);
        int godina= unos.nextInt();
        int brojgodine = brojDanauGodini(2000);
        System.out.println("Broj dana u " +godina + " godini  iznosi " +brojgodine + " dana " );
    }
    public static int brojDanauGodini(int godina){
        if ((godina % 4 ==0 || godina%100 !=0) && (godina%400==0)){
            return 366;
        }else return 365;
    }
}
