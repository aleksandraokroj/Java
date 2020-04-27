package com.company;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorPodstawowy = new Kalkulator();
        kalkulatorPodstawowy.dodawanie(10, 20);
        kalkulatorPodstawowy.odejmowanie(10, 20);
        KalkulatorStatystyczny kalkulatorStatystyczny = new KalkulatorStatystyczny();
        kalkulatorStatystyczny.dodawanie(10, 20);
        kalkulatorStatystyczny.odejmowanie(10, 20);
        kalkulatorStatystyczny.sinus(10);
    }
}

class Kalkulator {
    int a;
    int b;

    int dodawanie(int a, int b) {
        int wynik = a + b;
        System.out.println(wynik);
        return wynik;
    }

    int odejmowanie(int a, int b) {
        int wynik = a - b;
        System.out.println(wynik);
        return wynik;
    }
}

class KalkulatorStatystyczny extends Kalkulator {
    double a;

    double sinus(double a) {
        double wynik = Math.sin(a);
        System.out.println(wynik);
        return wynik;
    }
}