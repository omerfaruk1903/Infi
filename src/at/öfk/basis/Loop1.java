package at.öfk.basis;

public class Loop1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i; // Addiere die aktuelle Zahl zu der Summe.
        }

        // Ergebnis.
        System.out.println("Die Summe der Zahlen von 1 bis 100 beträgt: " + sum);
    }
}