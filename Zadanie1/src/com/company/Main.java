package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] liczby = new int [15];
	Random rand = new Random();

	for (int i=0; i<liczby.length; i++){
	    liczby[i] = rand.nextInt(101);
    }
        System.out.println("Wylosowano nastepujace wartosci");
        for (int numbers : liczby
             ) {
            System.out.println(numbers);
            
        }
        int indexMax = 0;
        int indexMin = 0;
        for (int i=1; i<liczby.length; i++){
            if(liczby[indexMax]<liczby[i]){
                indexMax = i;
            }
        }
        for (int i=1; i<liczby.length; i++){
            if (liczby[indexMin]>liczby[i]){
                indexMin = i;
            }
        }
        System.out.println("Element najmniejszy o indeksie " + indexMin + " to " + liczby[indexMin]);
        System.out.println("Element najwiekszy o indeksie " + indexMax + " to " + liczby[indexMax]);


    }
}
