package com.company.Predavanje.LekcijaSedamNizovi;

import java.util.Scanner;

public class OverLodadmetoda {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite 10 brojeva : ");
        int[] Integer = new int[10];
        double[] doublee = new double[10];
        for (int i = 0; i < 10; i++) {
            doublee[i] = unos.nextDouble();
            Integer[i] = (int) doublee[i];
        }
        averageInt(Integer);
        averageDouble(doublee);
        System.out.println("Prosjek za int je " +averageInt(Integer));
        System.out.println(" a za double prosjek je " + averageDouble(doublee));
    }
        public static int averageInt ( int[] array){
            int suma = 0;
            int brojUnosa = array.length;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];

            }
            int prosjek = suma / brojUnosa;
            return prosjek;
        }

        public static double averageDouble ( double[] array){
            double suma = 0;
            double brojUnosa = array.length;
            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
            double prosjek = suma / array.length;
            return prosjek;
        }
    }

