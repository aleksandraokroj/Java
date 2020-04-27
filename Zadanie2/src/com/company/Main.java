package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz słowo:");
        String tekst = scan.nextLine();
        System.out.println(ZamienPierwszaLitereZOstatnia(tekst));


    }
    static String ZamienPierwszaLitereZOstatnia (String slowo){
        int dlugoscSlowa = slowo.length();
        char [] znakiSlowa = slowo.toCharArray();
        char pierwszaLitera = znakiSlowa[0];
        char ostatniaLitera = znakiSlowa [dlugoscSlowa - 1];


        znakiSlowa [0] = ostatniaLitera;
        znakiSlowa [dlugoscSlowa - 1] = pierwszaLitera;

        return new String(znakiSlowa);
    }
}
