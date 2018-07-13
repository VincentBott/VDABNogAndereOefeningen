package org.betavzw;

import java.util.Scanner;


public class Optellen {


    public static void main(String[] args) {


        Scanner invoer = new Scanner(System.in);

        System.out.print("\n\tGeef getal 1: ");

        int getal1 = Integer.parseInt(invoer.nextLine());

        System.out.print("\n\tGeef getal 2: ");

        int getal2 = Integer.parseInt(invoer.nextLine());

        int som = getal1 + getal2;


        System.out.println("\n\t" + getal1 + " + " + getal2 + " = " + som);

    }



}
