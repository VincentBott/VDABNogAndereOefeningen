package org.betavzw;

import java.util.Scanner;


public class Bitcoin {
    public static void main(String[] args) {

        Scanner invoer = new Scanner(System.in);

        System.out.print("Wat was de bitcoinkoers 1 jaar geleden? ");

        int bitcoinToen = Integer.parseInt(invoer.nextLine());

        System.out.print("Wat is de bitcoinkoers nu ? ");

        int bitcoinNu = Integer.parseInt(invoer.nextLine());

        int bitcoinVerschil;

        System.out.println("\nDe koers vandaag: " + bitcoinNu + " EUR");
        System.out.println("De koers 1 jaar geleden: " + bitcoinToen + " EUR");

        if (bitcoinNu > bitcoinToen) {

            bitcoinVerschil = bitcoinNu - bitcoinToen;
            System.out.println("\nDe koers is met " + bitcoinVerschil + " EUR gestegen");

        } else if (bitcoinNu == bitcoinToen) {
            System.out.println("De koers is hetzelfde gebleven.");
        } else {
            bitcoinVerschil = bitcoinToen - bitcoinNu;
            System.out.println("De koers is met " + bitcoinVerschil + " EUR gedaald");
        }

    }

}
