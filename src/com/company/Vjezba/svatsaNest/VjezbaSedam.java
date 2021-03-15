package com.company.Vjezba.svatsaNest;

import java.util.Scanner;

/* Napišite program koji traži od korisnika da uđe u
minuta (npr. 1 milijarda) i prikazuje broj godina i dana minuta.
Radi jednostavnosti, pretpostavimo da godina ima 365 dana
 */
public class VjezbaSedam {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println(" Uesite broj minuta : ");
        int brojMinuta = unos.nextInt();
        int godine = brojMinuta / 525600;
        int brojDana = (brojMinuta % 525600) / 1440;
        System.out.println(brojMinuta + " minuta iznosi " + godine
                + " godina i " + brojDana + " dana");
    }
}
