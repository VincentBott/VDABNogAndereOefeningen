package org.betavzw;
/* KmMileConversie.java:
 * rekent om van km/u naar mile/hour
 */


public class KmMileConversie
{
    //declaratie van constanten:
    static final int MAXSNELHEID = 120;
    static final double KMPERMILE = 1.609;

    public static void main(String[] args)
    {


        double dMilePerHour = MAXSNELHEID/KMPERMILE;
        System.out.println(dMilePerHour + " Mijl/Uur");
    }
}




