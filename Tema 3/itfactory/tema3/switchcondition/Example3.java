package com.itfactory.tema3.switchcondition;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(20 + 1);

        switch (x)
        {
            case 0:
                System.out.println("Nu am primit nimic. Nu merg la film");
                break;
            case 1:
                System.out.println("Am un leu. Nu merg la film. Mai am nevoie de 4 lei.");
                break;
            case 2:
                System.out.println("Am doi lei. Nu merg la film. Mai am nevoie de 3 lei.");
                break;
            case 3:
                System.out.println("Am 3 lei. Nu merg la film. Mai am nevoie de 2 lei.");
                break;
            case 4:
                System.out.println("Am 4 lei. Nu merg la film. Mai am nevoie de 1 leu.");
                break;
            default:
                System.out.println("Am destui bani pentru film. Yeyyy");
        }

        //
        System.out.println(x);
    }
}
