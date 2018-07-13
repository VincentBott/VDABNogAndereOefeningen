package org.betavzw;

import java.util.Scanner;

public class Voetbal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de eerste ploeg: ");

        String naamEerstePloeg = scanner.nextLine();

        System.out.print("Geef de tweede ploeg: ");

        String naamTweedePloeg = scanner.nextLine();


        System.out.print("Geef aantal goals eerste ploeg: ");

        int aantalGoalsEerstePloeg = Integer.parseInt(scanner.nextLine());

        System.out.print("Geef aantal goals tweede ploeg: ");

        int aantalGoalsTweedePloeg = Integer.parseInt(scanner.nextLine());


        if (aantalGoalsEerstePloeg > aantalGoalsTweedePloeg) {
            System.out.println(naamEerstePloeg + " is gewonnen !");
        }
        else if (aantalGoalsTweedePloeg > aantalGoalsEerstePloeg){
            System.out.println(naamTweedePloeg + " is gewonnen !");

        } else {
            System.out.println("Het is een gelijkspel !");
        }
        }
    }