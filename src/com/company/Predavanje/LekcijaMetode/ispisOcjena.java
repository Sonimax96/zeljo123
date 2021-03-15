package com.company.Predavanje.LekcijaMetode;

public class ispisOcjena {


    public static void main(String[] args) {
        IspisOcjene(65.9);
        IspisOcjene(49);
    }
     public static void IspisOcjene (double bodovi){

        if (bodovi >= 90) {
            System.out.println(" Dobili ste 10 !");
        }
        if (bodovi >= 80 && bodovi < 90) {
            System.out.println(" Dobili ste 9");
        }
        if (bodovi >= 70 && bodovi < 80) {
            System.out.println(" Dobili ste 8!");
        }
        if (bodovi >= 60 && bodovi < 70) {
            System.out.println(" Dobili ste 7!");
        }
        if (bodovi >= 50 && bodovi < 59) {
            System.out.println(" Dobili ste 6!");
        }
        if (bodovi > 0 && bodovi <50) {
            System.out.println(" Dobili ste 5,los si ko Željo!");
        }

    }
}

