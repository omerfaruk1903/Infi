package at.öfk.basis;
public class Loop2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 1000; i += 2) {
            sum += i; // Addiere die aktuelle Zahl zu der Summe
        }

        // Ergebnis
        System.out.println("Die Summe der geraden Zahlen von 2 bis 1000 beträgt: " + sum);
    }
}