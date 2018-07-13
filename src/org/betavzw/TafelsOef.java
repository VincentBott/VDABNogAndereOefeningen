package org.betavzw;
/*
 * Tafels.java
 *
 * a) Gebruik 2 geneste for-lussen om
 * de tafels van 1 t.e.m 5 te tonen.
 *
 * b) Pas het programma aan zodat enkel de
 * "oneven tafels" getoond worden.
 * Doe dit door een selectie in te bouwen.
 */

public class TafelsOef {

    public static void main(String[] args){
        for(int tafel=1; tafel<= 5; tafel++){
            if (tafel%2 == 1){ // tafel is oneven
                System.out.println("Dit is de tafel van " + tafel + ":");
                for (int factor=1; factor <= 10; factor++){
                    System.out.println(factor + " x " + tafel +
                            " = " + factor*tafel);
                }
            }
        }

    }
}
