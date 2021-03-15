package com.company.Vjezba.MetodeiString;

import java.util.Scanner;

public class KonverzijaMetreiStope {
    public static void Ispis() {
        int metar = 20;
        System.out.println("Stopa-Metar | Metar -- Stopa");
        for (int stopa = 1; stopa <= 10; stopa++) {
            System.out.println(stopa + "    " + stopeUmetre(stopa) + " | " + metar + "       " + metreuStope(stopa));
        metar+=5;
        }
    }

    private static double stopeUmetre(double stope) {
        return 0.305 * stope;
    }

    private static double metreuStope(double metre) {
        double stopa = 3.279 * metre;
        return stopa;
    }
}
