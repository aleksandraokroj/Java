package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazenie przyklad = new PrzykladPrzeciazenie();
        przyklad.wypisz(10);
        przyklad.wypisz(19.2);
        przyklad.wypisz("tekst");
    }
}

class PrzykladPrzeciazenie {
    public void wypisz(int x) {
        System.out.println("int = " + x);
    }

    public void wypisz(double x) {
        System.out.println("double = " + x);
    }

    public void wypisz(String tekst) {
        System.out.println("Przeciazenie argument " + tekst);
    }
}
