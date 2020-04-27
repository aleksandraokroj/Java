package com.company;

public class Main {

    public static void main(String[] args) {
        Przyklad pierwszy = new Przyklad();
        pierwszy.wypisz();
        Przyklad drugi = new Przyklad(19);
        drugi.wypisz();

    }
}

class Przyklad {
    int wartosc;

    public void wypisz() {
        System.out.println(wartosc);
    }

    Przyklad() {
        wartosc = 10;
    }

    Przyklad(int x) {

        wartosc = x;
    }
}
