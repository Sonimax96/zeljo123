package com.company.Predavanje.LekcijaCetiri;

public class BrojeviDjeljivis5_6 {
    public static void main(String[] args) {
        int brojac=0;

        for (int i=100; i < 1000; i++){

            if (i % 5 ==0 ^ i  % 6 ==0  ){
                if (brojac%10 == 0)
                    System.out.println();
            }
            brojac++;
            System.out.print( " " +i);
        }
    }
}
