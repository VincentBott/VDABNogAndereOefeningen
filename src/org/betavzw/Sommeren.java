package org.betavzw;
import javax.swing.*;
import java.util.Scanner;

public class Sommeren{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sGetal;
        int iGetal1, iGetal2, iSom;
        System.out.print("Eerste getal: ");
        sGetal = scanner.nextLine();
        iGetal1 = Integer.parseInt(sGetal);
        System.out.print("Tweede getal: ");
        sGetal = scanner.nextLine();
        iGetal2 = Integer.parseInt(sGetal);
        iSom = iGetal1 + iGetal2;
        System.out.println(iGetal1+" + "+iGetal2+" = "+iSom);
    }
}
