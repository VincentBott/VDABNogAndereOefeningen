package org.betavzw;

/* GGD.java
 * Drukt de grootst gemene deler af van opgegeven getallen.
 * een wiskundig gegeven:
 *   als a > b
 *   en f is de GGD van a en b
 *   => f is ook GGD van (a-b) en b.
 * Dit gegeven wordt als volgt toegepast:
 * de grootste van de twee getallen wordt
 * keer op keer
 * vervangen door het verschil van beide getallen,
 * totdat beide gelijk zijn.
 * Dit getal is de GGD.
 */


public class GGDOef{
    public static void main(String[] args){
        int a = 65;
        int b = 39;
        String tekst = "De grootst gemene deler van " + a +" en " +b +" is ";
        while(a != b)
        {
            if (a>b) a -= b;
            else     b -= a;
        }
        System.out.println(tekst + a);
    }
}
