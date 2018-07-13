package org.betavzw;
/*Rekenkundig.java
 *voorbeelden van bewerkingen
 */

public class Rekenkundig{
    public static void main(String[] args){
        int x = 1, y = 2, z = 3;
        int som;
        int resultaat1, resultaat2;

        som = x + y;
        System.out.println(som);
        som = som + x;
        System.out.println(som);
        som += x;
        System.out.println(som);
        som++;
        System.out.println(som);
        System.out.println(som++);     // Niet op deze manier gebruiken !
        System.out.println(som);

        resultaat1 = x + y * z;   // vermenigvuldiging heeft voorrang op optellen.
        System.out.println("zonder haakjes : " + resultaat1);
        resultaat2 = (x + y) * z;
        System.out.println("met haakjes : " + resultaat2);
    }
}
