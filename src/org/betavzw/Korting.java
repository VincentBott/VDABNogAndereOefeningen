package org.betavzw;


import java.util.Scanner;


public class Korting {

    public static void main(String[] args) {

        Scanner invoer = new Scanner(System.in);

        System.out.print("Wat is het aankoopbedrag ? ");

        double aankoopbedrag = Double.parseDouble(invoer.nextLine());


    //    double percentage = 0.05;


        double teBetalenBedrag;

        if (aankoopbedrag > 75 && aankoopbedrag <= 100) {
            teBetalenBedrag = aankoopbedrag * 0.95;
        }  else if (aankoopbedrag > 100 && aankoopbedrag < 500){
            teBetalenBedrag = aankoopbedrag * 0.90;
        } else if (aankoopbedrag > 500) {
            teBetalenBedrag = aankoopbedrag * 0.85;
        } else {
            teBetalenBedrag = aankoopbedrag;
        }

        System.out.println("Het aankoopbedrag: " + aankoopbedrag);

        System.out.println("Het te betalen bedrag: " + teBetalenBedrag);
    }
}
