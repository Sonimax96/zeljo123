package com.company.JaiBoki;

import java.util.*;
public class Loto
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        int[] brK=new int[5];
        int[] brL=new int[5];
        int br1=0;
//glavni izbornik
        System.out.println("Da bi ste ucestvovali u igri LOTO 5/39 odaberite jednu od opcija: ");
        System.out.println("1. Samostalni unos 5 brojeva");
        System.out.println("2. Automatsko kreiranje 5 brojeva");
        System.out.println("3. Izlaz");
        int p=sc.nextInt();
        System.out.println("Unesite fond nagrada: ");
        int fond=sc.nextInt();
        if(p==1)
        {
            System.out.println("Unesite 5 brojeva: "); //korisnik unosi 5 brojeva za listic
            for(int i=0; i<5; i++)
            { brK[i]=sc.nextInt();
                while(brK[i] == 40) {
                    System.out.println("Brojevi moraju biti u rasponu od 1-39! Unesite novi broj: ");
                    brK[i]=sc.nextInt();
                }}}
        else if(p==2)
        {
            for(int i=0; i<5; i++) {
                brK[i]=1+rnd.nextInt(40); }
        }
        System.out.println("Vasi brojevi su: ");
        for(int i=0; i<5; i++)
        { System.out.print(brK[i]+"\t"); }
        System.out.println();
        for(int i=0; i<5; i++) //izvlacenje 5 dobitnih brojeva LOTO-a
        { brL[i]=1+rnd.nextInt(40); }
        System.out.println("Izvuceni brojevi su: ");
        for(int i=0; i<5; i++)
        {System.out.print(brL[i]+"\t"); }
        System.out.println();
        for(int i=0; i<5; i++) //preborjavanje tacnih kombinacija
        {
            for(int j=0; j<5; j++)
            { if(brK[i]==brL[j])
            { br1++; }
            }
        }
        if(p!=3)
        {
            if(br1==2)
            {
                System.out.println("Pogodili ste 2 broja i vas dobitak je: "+fond*0.05+" KM");
            }
            else if(br1==3)
            {
                System.out.println("Pogodili ste 3 broja i vas dobitak je: "+fond*0.10+" KM");
            }
            else if(br1==4)
            {
                System.out.println("Pogodili ste 4 broja i vas dobitak je: "+fond*0.25+" KM");
            }
            else if(br1==5)
            {
                System.out.println("Jackpot!!! Vas dobitak je: "+fond*0.6+" KM");
            }
            else {System.out.println("Listic nije dobitni!"); }
        }
        else if(p==3)
        {System.exit(0);}

    }}