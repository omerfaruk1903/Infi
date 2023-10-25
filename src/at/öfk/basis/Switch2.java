package at.öfk.basis;
import java.util.Random;

public class Switch2 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int number = random.nextInt(6) + 5;

        switch(number) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Unexpected number: " + number);
                break;
        }
    }
}