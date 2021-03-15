package com.company.JaiBoki;

import java.util.Scanner;

public class SekundeuMinute {
    public static void main(String[] args) {
        Scanner unos =new Scanner(System.in);
        System.out.println("Molimo unesite sekunde: ");
        int sekunde =unos.nextInt();
        int minute = sekunde / 60 ;
        int preostaleSekunde = sekunde % 60;
        System.out.println(sekunde + " sekundi je " + minute + " minuta i " + preostaleSekunde + " sekundi.");
    }
}
