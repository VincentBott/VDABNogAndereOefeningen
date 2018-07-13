package org.betavzw;

import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * ContinueTest.java
 */
public class ContinueTest {
    public static void main(String[] args) {
        char doorgaan;
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=10; i++){
            System.out.print("deze waarde niet verwerken (C), lus stoppen (B), "+
                    "deze waarde verwerken (ander karakter) ?");
            doorgaan = scanner.nextLine().charAt(0);
            if (doorgaan == 'c' || doorgaan == 'C')
                // eindig huidige iteratie, ga verder met volgende iteratie
                continue;
            else if (doorgaan == 'b' || doorgaan == 'B')
                break; // eindig omsluitende lus
            System.out.println(i + " verwerkt");
        }
        System.out.println("einde programma");
    }

}
