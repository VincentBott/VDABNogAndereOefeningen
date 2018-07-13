package org.betavzw;


import java.util.Scanner;


public class DatumVroeger {

    public static void main(String[] args) {

        Scanner invoer = new Scanner(System.in);

        System.out.print("\n\tGeef de dag: ");

        String dag = invoer.nextLine();

        System.out.print("\n\tGeef de maand: ");

        String maand = invoer.nextLine();

        System.out.print("\n\tGeef het jaar: ");

        int jaar = Integer.parseInt(invoer.nextLine());

        System.out.print("\n\tHoeveel jaar moeten we terug tellen ?  ");

        int jaarTerug = Integer.parseInt(invoer.nextLine());

        int jaarResultaat = jaar - jaarTerug;


        System.out.println("\n\t" + jaarTerug + " jaar geleden was het: " + dag + " " + maand + " " + jaarResultaat);
    }




}
