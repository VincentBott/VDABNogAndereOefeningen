package org.betavzw;
/* Graad_Genest.java
 * Druk de behaalde graad af adhv de opgegeven punten.
 */

public class GraadGenestOef
{
    public static void main(String[] args)
    {
        int punten = 15;
        String graad;

        if (punten < 0)
            graad = "Examen niet afgelegd";
        else
        {
            if (punten < 10)
                graad = "Onvoldoende";
            else
            {
                if (punten < 14)
                    graad = "Voldoende";
                else
                {
                    if (punten < 16)
                        graad = "Onderscheiding";
                    else
                    {
                        if (punten < 18)
                            graad = "Grote Onderscheiding";
                        else
                            graad = "Grootste Onderscheiding";
                    }
                }
            }
        }

        System.out.println(graad);
    }
}
