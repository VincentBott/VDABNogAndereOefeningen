package org.betavzw;

import java.util.Scanner;

public class Fout2 {

    static final int HUIDIGJAAR = 2018;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef je leeftijd: ");

        int leeftijd = Integer.parseInt(scanner.nextLine());
        System.out.println("Je bent in " + (HUIDIGJAAR - leeftijd) + " geboren.");

    }
}
