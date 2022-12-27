package com.itfactory.tema3.ifcondition;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);

        if(randomInt >= 75 && randomInt<=100) {
            System.out.println("Numarul se afla in intervalul 75 - 100 "+"Numarul este "+randomInt);
        } else if(randomInt >= 50 && randomInt<75){
            System.out.println("Numarul se afla in intervalul 50 - 75 "+"Numarul este "+randomInt);
        } else if(randomInt >= 25 && randomInt<50){
            System.out.println("Numarul se afla in intervalul 25 - 50 "+"Numarul este "+randomInt);
        } else if(randomInt >= 1 && randomInt<25){
            System.out.println("Numarul se afla in intervalul 1 - 25 "+"Numarul este "+randomInt);
        }
    }
}
