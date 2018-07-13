package org.betavzw;

import java.util.Scanner;

public class temperatuurKelvin {


    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        final double ABSOLUUTNULPUNT = 273.15;

        System.out.println("Wat is de temperatuur in Kelvin ? ");

        double tempKelvin = Double.parseDouble(invoer.nextLine());

        if (tempKelvin < 0) {
            System.out.println("FOUTMELDING U kan geen negatieve Kelvintemperatuur ingeven.");
        }
        else {
            double tempCelcius = tempKelvin - ABSOLUUTNULPUNT;

            System.out.println("De temperatuur in Celcius is " + tempCelcius);
        }

    }
}
