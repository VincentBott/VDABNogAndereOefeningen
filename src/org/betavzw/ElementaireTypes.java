package org.betavzw;
/* ElementaireTypes.java:
 * drukt voorbeelden af van
 * Java's elementaire gegevenstypes
 */

public class ElementaireTypes
{
    public static void main(String[] args)
    {
        //declaratie van variabelen:
        byte    bt;
        short   sh;
        int     maximum  = 2147483647;
        long    grootGetal;
        float   kleinKommaGetal = 987.65F;
        double  grootKommaGetal = 123.4567890123, dNul = 0;
        boolean ikBenTrue = true;
        char    chA = 'A', chUnicodeVb = '\u01F2', chMinimum = '\u0000';

        //variabelen een waarde geven:
        bt = 127;
        sh = -32768;
        grootGetal = 1234567890123L;

        //een voor een afdrukken:
        System.out.println("byte bt                     = " + bt);
        System.out.println("short sh                    = " + sh);
        System.out.println("int maximum                 = " + maximum);
        System.out.println("long grootGetal             = " + grootGetal);
        System.out.println("float kleinKommaGetal       = " + kleinKommaGetal);
        System.out.println("double grootKommaGetal      = " + grootKommaGetal);
        System.out.println("double dNul                 = " + dNul);
        System.out.println("boolean ikBenTrue           = " + ikBenTrue);
        System.out.println("char chA                    = " + chA);
        System.out.println("char chUnicodeVb            = " + chUnicodeVb);
        System.out.println("char chMinimum              = " + chMinimum);
    }
}
