package com.company.Vjezba.svatsaNest;
/* Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.*/

import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        System.out.print( "Karta je :");
        int karta = (int) (Math.random() * (14-1)) + 1;
        int znak = (int)(Math.random() *4)+1;
        switch (karta){
            case 1:
                System.out.println("Kec");break;
            case 2:
                System.out.println("2");break;
            case 3:
                System.out.println("3");break;
            case 4:
                System.out.println("4");break;
            case 5:
                System.out.println("5");break;
            case 6:
                System.out.println("6");break;
            case 7:
                System.out.println("7");break;
            case 8:
                System.out.println("8");break;
            case 9:
                System.out.println("9");break;
            case 10:
                System.out.println("10");break;
            case 11:
                System.out.println("Zandar");break;
            case 12:
                System.out.println("Dama");break;
            case 13:
                System.out.println("Kralj");break;
        }
        switch (znak) {
            case 1:
                System.out.println("List");
                break;
            case 2:
                System.out.println("Srce ");
                break;
            case 3:
                System.out.println("MAK");
                break;
            case 4:
                System.out.println("Kocka " );
                break;
        }
    }
}
