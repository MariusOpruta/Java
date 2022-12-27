package com.itfactory.tema3.switchcondition;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(4 + 1);

        switch (x)
        {
            case (0):
                System.out.println("Nu am nicio bomboana");
                break;
            case (1):
                System.out.println("Am o bomboana");
                break;
            default:
                System.out.println("Am bomboane");
        }

        //Pentru verificare puteti afisa numarul generat.
        System.out.println(x);
    }
}
