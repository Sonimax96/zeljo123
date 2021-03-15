package com.company.DomacaZadaca;

public class Razlomci {
    public static void main(String[] args) {
        int brojac=0;
        int djeljenik=1;
        for (int i=1 ,j = 3 ; i <98 && j<100 ; i+=2 , j+=2){
            djeljenik+=2;

            System.out.print(i+" / " +j +"     ");
        }

    }
}
