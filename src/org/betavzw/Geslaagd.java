package org.betavzw;
/* Geslaagd.java
 * Voorbeeld van if-else.
 */
public class Geslaagd{
    public static void main(String[] args){
        int iPunten = 50;
        boolean bGeslaagd;

        bGeslaagd = iPunten >= 50;
        if (bGeslaagd == true){
            System.out.println("Proficiat,\nU bent geslaagd.");
        }
        else{
            System.out.println("U bent niet geslaagd.");
        }
    }
}