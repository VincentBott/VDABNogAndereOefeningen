package org.betavzw;

import java.util.Scanner;

public class  getalGroter{

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een getal: ");

        int getal = Integer.parseInt(scanner.nextLine());

        if (getal <= 0) {
        System.out.println("Dit getal is niet groter dan 0.");
        }
        else {
        System.out.println("Zeer goed");
        }
    }
}




