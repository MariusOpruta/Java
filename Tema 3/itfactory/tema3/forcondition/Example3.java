package com.itfactory.tema3.forcondition;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i ;
        int limitaInferioara = random.nextInt(30);
        int limitaSuperioara = random.nextInt(30);
        if (limitaInferioara < limitaSuperioara)
        {
            System.out.println("S-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
            for (i=limitaInferioara;i<=limitaSuperioara;i++)
            {
                System.out.print(" " + i + " ");
            }
        } else {
            System.out.println("Nu s-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
        }
    }
}
