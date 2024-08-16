package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Willkommen im Bootcamp");
        System.out.println("Hello world!");

        // DATA Types

        // Strings
        String textOfHippHurra = "Hipp, Hipp, Hurra!!";

        System.out.println(textOfHippHurra);
        System.out.println(textOfHippHurra);
        System.out.println(textOfHippHurra);

        // primitive Datentypen

        // integer (Zahlen)
        int number = 10;
        double numberWithDecimal = 10.0454981;
        boolean trafficLightIsGreen = true;

        System.out.println("Berechnungen und Ergebnisse:");

        int x = 10;
        int y = 5;

        System.out.println(x >= y);

        // logical operators

        boolean itIsRainingToday = true;
        boolean itIsRainingTomorrow = false;

        // && operator (true if both values are true)
        System.out.println("Zwei Tage Regen? " + (itIsRainingToday && itIsRainingTomorrow));

        // || operator (true if both values are true)
        System.out.println("Mindest ein tag Regen? " + (itIsRainingToday || itIsRainingTomorrow));

        // ! "switch" booleans
        System.out.println("Mindest ein tag Regen? " + !itIsRainingToday);

    }
}

