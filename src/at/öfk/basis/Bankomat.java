package at.öfk.basis;
import java.util.Scanner;
public class Bankomat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ein Scanner-Objekt für Benutzereingaben
        double kontostand = 0; // Anfangskontostand
        System.out.println("Gruß vom Bankomat!");


        while (true) {
            System.out.println("\nWählen Sie bitte eine der folgenden Optionen:");
            System.out.println("1. Geld einzahlen");
            System.out.println("2. Geld abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Vorgang beenden");
            System.out.print("Ihre Auswahl: ");


            int auswahl = scanner.nextInt(); // Benutzereingabe lesen

            if (auswahl == 1) {
                System.out.print("Bitte Einzahlungsbetrag eingeben: ");
                double betrag = scanner.nextDouble();
                kontostand += betrag; // Kontostand erhöhen
                System.out.println(betrag + " Euro hinzugefügt. Aktueller Kontostand: " + kontostand + " Euro");

            } else if (auswahl == 2) {
                System.out.print("Bitte Abhebungsbetrag eingeben: ");
                double betrag = scanner.nextDouble();
                if (betrag > kontostand) {
                    System.out.println("Unzureichender Kontostand.");

                } else {
                    kontostand -= betrag; // Kontostand verringern
                    System.out.println(betrag + " Euro entnommen. Aktueller Kontostand: " + kontostand + " Euro");
                }

            } else if (auswahl == 3) {
                System.out.println("Ihr Kontostand beträgt: " + kontostand + " Euro");

            } else if (auswahl == 4) {
                System.out.println("Danke für die Nutzung unseres Geldautomaten. Bis zum nächsten Mal!");
                break;

            } else {
                System.out.println("Diese Auswahl ist nicht gültig. Bitte wählen Sie 1, 2, 3 oder 4.");
            }
        }
    }
}