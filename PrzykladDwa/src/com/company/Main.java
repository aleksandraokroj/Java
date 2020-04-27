package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladDwa pierwszy = new PrzykladDwa();
        pierwszy.wypisz();
        PrzykladDwa drugi = new PrzykladDwa(10);
        drugi.wypisz();
        PrzykladDwa trzeci = new PrzykladDwa(50, 4.5);
        trzeci.wypisz();
    }
}

class PrzykladDwa {
    double prawdziwy;
    double wyimaginowany;

    public void wypisz() {
        System.out.println(prawdziwy + " i " + wyimaginowany);
    }

    PrzykladDwa() {
        prawdziwy = 0;
        wyimaginowany = 0;
    }

    PrzykladDwa(double x) {
        prawdziwy = x;
        wyimaginowany = 0;
    }

    PrzykladDwa(double x, double y) {
        prawdziwy = x;
        wyimaginowany = y;
    }
}
