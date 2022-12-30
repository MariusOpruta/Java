package com.itfactory.tema3.forcondition;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int i ;
        Random random = new Random();
        for(i=0;i<20;i++)
        {
            int x =random.nextInt(20+1);
            if ((i + x) == 30)
            {
                System.out.println("Am gasit un match: " + i + " : " + x);
            }
        }
    }
}
