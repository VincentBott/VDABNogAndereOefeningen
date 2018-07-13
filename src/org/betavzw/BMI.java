package org.betavzw;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner invoer = new Scanner(System.in);

        System.out.print("\n\tGeef de lengte(m): ");

        String slengte = invoer.nextLine();

        double dlengte = Double.parseDouble(slengte);


        System.out.print("\n\tGeef het gewicht(kg): ");

        String sgewicht = invoer.nextLine();

        double dgewicht = Double.parseDouble(sgewicht);


        double BMI = dgewicht / (dlengte * dlengte);


        System.out.println("\n\tDe BMI is " + BMI);

        if (BMI > 25 || BMI < 18) {
            System.out.println("\tOeioei");
        }
        else  {
            System.out.println("\tOK");
        }


    }

}
