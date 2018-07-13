package org.betavzw;

import java.util.Scanner;


public class Tijdsduur {

    public static void main(String[] args) {


        int iAfstand;
        int iSnelheid;

        String sSnelheid;
        String sAfstand;


        Scanner invoer = new Scanner(System.in);

        System.out.print("\n\tGeef de afstand(km): ");

        sAfstand = invoer.nextLine();


        System.out.print("\n\tGeef de snelheid(km/h): ");

        sSnelheid = invoer.nextLine();


        iAfstand = Integer.parseInt(sAfstand);

        iSnelheid = Integer.parseInt(sSnelheid);


        int duurtijd = iAfstand / iSnelheid;


        System.out.println("\n\tDe gemiddelde duurtijd is " + duurtijd + " uur");

    }
}
