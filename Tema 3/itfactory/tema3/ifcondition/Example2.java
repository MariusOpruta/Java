package com.itfactory.tema3.ifcondition;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(50);
        int y = random.nextInt(50);

        int suma = x + y;
        if (suma > 70)
        {
            System.out.println("Suma " + suma + " este mai mare decat 70");
        }
        else if (suma<70)
        {
            System.out.println("Suma " + suma + " este mai mica decat 70");
        }else {
            System.out.println("Suma " + suma + " este egala cu 70");
        }
    }
}
