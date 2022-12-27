package com.itfactory.tema3.ifcondition;

import java.util.Random;

public class Example4 {
    public static void main(String[] args) {

        Random random = new Random();
        int culoare1 = random.nextInt(3 + 1);
        int culoare2 = random.nextInt(3 + 1);
        //int culoare3 = random.nextInt(3 + 1);

        if (culoare2 !=3 && culoare1!=3)
        {
            System.out.println("Nonculori: " + culoare1 + ":" + culoare2);
        } else if(culoare2==3 && culoare1==3){
            System.out.println("Culori: " + culoare1 + ":" + culoare2);
        }else {
            System.out.println("Culori amestecate :): " + culoare1 + ":" + culoare2);
        }

    }
}
