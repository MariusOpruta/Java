package com.itfactory.tema3.whilecondition;

import java.util.Random;

public class Example4 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10 + 1);
        while (x<=10)
        {
            if (x!=5){
                System.out.println("Numarul este OK: "+x);
                break;
            }else {
                System.out.println("Numarul este 5. Iesire");
                break;
            }


        }
    }
}