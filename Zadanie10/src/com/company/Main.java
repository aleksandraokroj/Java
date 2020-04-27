package com.company;

public class Main {

    public static void main(String[] args) {
        Zadanie10 pierwszy = new Zadanie10();
        Zadanie10 drugi = new Zadanie10(2, 5);
        pierwszy.wykonajOperacjeMatematycznaDodawanie();
        pierwszy.wykonajOperacjeMatematycznaDodawanie(7);
        drugi.wykonajOperacjeMatematycznaDodawanie(2);
        drugi.wykonajOperacjeMatematycznaMnozenie(2, 5);

    }
}

class Zadanie10 {
    int a;
    int b;

    Zadanie10() {
        a = 1;
        b = 1;

    }

    Zadanie10(int x) {
        a = x;
        b = 1;
    }

    Zadanie10(int x, int y) {
        a = x;
        b = y;
    }

    int wykonajOperacjeMatematycznaDodawanie() {
        int wynik = a + b;
        System.out.println(wynik);
        return wynik;

    }

    int wykonajOperacjeMatematycznaDodawanie(int a) {
        int wynik = a + b;
        System.out.println(wynik);
        return wynik;
    }

    int wykonajOperacjeMatematycznaMnozenie(int a, int b) {
        int wynik = a * b;
        System.out.println(wynik);
        return wynik;
    }


}
