package com.itfactory.tema3.whilecondition;

import java.util.Random;

public class Example2 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        while (x>=50 && x<101){
            System.out.print(" "+x);
            x--;
        }
        System.out.println(" Numarul este mai mic decat 50");
    }

}

