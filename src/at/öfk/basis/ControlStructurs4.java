package at.öfk.basis;

import java.util.Random;

public class ControlStructurs4 {

    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        int randomNumber1 = random.nextInt(100);

        System.out.println(randomNumber);
        System.out.println(randomNumber1);

        if((randomNumber<randomNumber1) && (randomNumber1>50)){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");

        } else if((randomNumber>30) && (randomNumber1>30)){
            System.out.println("Eine der beiden ist kleiner als 30");

        } else if (randomNumber>50 && randomNumber1!=50){
            System.out.println("Erste Zahl klein, zweite kein 50iger");

        }
        // Gib die Zufallszahl aus

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }
}