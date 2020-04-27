package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] wylosowaneLiczby = new int[6];
        int index = 0;
        boolean flaga;
        do {
            wylosowaneLiczby[index] = rand.nextInt( 49) + 1;
            flaga = true;
            for (int i=0; i<index; i++){
                if(wylosowaneLiczby[index]== wylosowaneLiczby[i]){
                    flaga=false;
                    break;
                }

            }
            if (flaga){
                index++;
            }
        }
        while (index<6);

        System.out.println("Wylosowane liczby to ");
        for (int liczba: wylosowaneLiczby
             ) {
            System.out.println(liczba);
        }

    }
}
