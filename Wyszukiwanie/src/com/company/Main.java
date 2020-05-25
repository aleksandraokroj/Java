package com.company;

public class Main {

    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 10, 20};
        int ele = 30;
        WyszukiwanieRownych x = new WyszukiwanieRownych();
        int index = x.szukaj(tab, ele);
        if (index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Zanaleziono w indeksie numer " + index);
        }


    }
}

abstract class Wyszukiwanie {
    boolean porownaj(int a, int b) {
        return false;
    }

    int szukaj(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}

class WyszukiwanieRownych extends Wyszukiwanie {
    @Override
    boolean porownaj(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie {
    @Override
    boolean porownaj(int a, int b) {
        if (a == b) {
            return false;
        } else {
            return true;
        }
    }
}
