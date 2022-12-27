package com.itfactory.tema3.switchcondition;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(3+1);
        System.out.println("Numarul este "+x);

        switch (x)
        {
            case (1):
                System.out.println("Am generat random 0 ");
                break;
            case (2):
                System.out.println("Am generat random 1 ");
                break;
            case (3):
                System.out.println("Am generat random 2 ");
                break;

        }




    }

}







