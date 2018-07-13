package org.betavzw;
/* TypesWijzigen.java:
 * voorbeelden van mengen of combineren van datatypen
 */
import javax.swing.*;

public class TypesWijzigen{

    public static void main(String[] args)    {
        int leeftijd = 56;
        double ouderdom = leeftijd;

        int snelheid;
        double valSnelheid = 9.81;
        snelheid = (int)valSnelheid;

        int teller = 3, noemer = 4;
        double uitkomst1, uitkomst2, uitkomst3;
        uitkomst1 = teller/noemer;
        uitkomst2 = teller / (double)noemer;
        uitkomst3 = 3.0/4;
        System.out.println("ouderdom = " + ouderdom + "\n" +
                        "snelheid = " + snelheid + "\n" +
                        "uitkomst1 = " + uitkomst1 + "\n" +
                        "uitkomst2 = " + uitkomst2 + "\n" +
                        "uitkomst3 = " + uitkomst3);
    }
}



