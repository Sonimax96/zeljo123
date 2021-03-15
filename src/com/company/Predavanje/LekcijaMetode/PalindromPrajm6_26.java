package com.company.Predavanje.LekcijaMetode;

public class PalindromPrajm6_26 {
    public static void main(String[] args) {
        boolean palindrom = palindromPrajm(123);
        System.out.println(" " + palindrom);
        boolean prajm = jeProst(7);
        System.out.println(prajm);
        System.out.println();
    }

    public static boolean palindromPrajm(int broj) {
        int obrnutiBroj = 0;
        int originalniBroj = broj;
        while (broj > 0) {
            int zadnjiBroj = broj % 10;
            broj = broj / 10;
            obrnutiBroj += zadnjiBroj;
            System.out.print(zadnjiBroj);
        }
        return obrnutiBroj == originalniBroj;
    }

    private static boolean jeProst(int broj) {
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static void ispisiPrviSto() {
        int brojacprviSto = 0;
        int brojkojiIspituje = 2;
        while (true) {
            if (brojacprviSto == 100)
                break;
        }

        if (palindromPrajm(brojacprviSto) && jeProst(brojkojiIspituje)) {
            brojacprviSto++;
            System.out.println("Broj koji ispisujemo " + brojacprviSto);
            if (brojacprviSto % 10 == 0) {
                System.out.println();
            }
        }
    }
}
