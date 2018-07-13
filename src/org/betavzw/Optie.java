package org.betavzw;
/* Optie.java
 * Drukt af welke optie werd gekozen.
 */

public class Optie{
    public static void main(String[] args){
        char cOptie = 'S';

        switch(cOptie)
        {
            case 'Q': System.out.println("Afbreken");
                //break;
            case 'S': System.out.println("Opslaan");
                //break;
            case 'O': System.out.println("Openen");
                break;
            case 'P': System.out.println("Afprinten");
                break;
            default : System.out.println("Ongeldige keuze");
                break;
        }
    }
}
