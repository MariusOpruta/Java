package com.itfactory;

import java.util.Scanner;

public class matematica {
    public static void main(String[] args) {
        {
            //problema optionala
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            int x = scanner.nextInt();
            System.out.println("Introduceti alt numar cu zecimare: ");
            double z = scanner.nextDouble();
            System.out.println("Introduceti al doilea numar: ");
            int y = scanner.nextInt();
            System.out.println("Introduceti alt numar cu zecimale: ");
            double w = scanner.nextDouble();
            System.out.println("Restul impartirii este: " + (x % y));
            System.out.println("Restul impartirii este: " + (z % w));
        }

        {
            //primitive1.java
            int intValue1 = 1;
            double intValue2 = 5.1;

            long longValue1 = 150000L;
            long longValue2 = 100000000000L;

            float floatValue1 = 1.3f;
            float floatValue2 = 23.123123f;

            double doubleValue1 = 2.5d;
            double doubleValue2 = 123.443423;

            boolean booleanValue1 = true;
            int booleanValue2 = 5;

            char charValue1 = 'a';
            char charValue2 = 67;

            System.out.println(intValue1);
            System.out.println(intValue2);
            System.out.println(longValue1);
            System.out.println(longValue2);
            System.out.println(floatValue1);
            System.out.println(floatValue2);
            System.out.println(doubleValue1);
            System.out.println(doubleValue2);
            System.out.println(booleanValue1);
            System.out.println(booleanValue2);
            System.out.println(charValue1);
            System.out.println(charValue2);
        }

        {
            //primitive2.java
            double x = 3.2;
            float y = 5.6f;
            double z = 2.3d;

            double mediaAritmetica = (x+y+z) / 3.0;
            System.out.println("Media aritmetica este: " + mediaAritmetica);

        }
        {
            //primitive3.java
            double x = 3.5d;
            double y = 123141.21112222d;

            double z = y / x;

            System.out.println("Impartirea celor doua numere este  " + z);
        }
        {
            //primitive4.java
            int x = 3;
            char c = 'c';

        /*
            Este posibil sa adun o variabila de tip int cu o variabila de tip char?
            Practic un numar cu un caracter?
            Raspuns: DA! Deoarece variabilele de tip char sunt reprezentate de numere
            link: https://www.javatpoint.com/char-keyword-in-java (Primitiva 'char').
            Acest link va ajuta pentru a intelge primitiva 'char' https://www.asciitable.com/
         */
            int adunare = x + c;
            System.out.println(adunare);
        }
        {
            //primitive5.java
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti prima latura a triunghiului: ");
            int x = scanner.nextInt();
            System.out.println("Introduceti a doua latura a triunghiului: ");
            int y = scanner.nextInt();
            System.out.println("Introduceti a treia latura a triunghiului: ");
            int z = scanner.nextInt();
            System.out.println("Perimetrul triunghiului este: "+ (x+y+z));
        }
        {
            //primitive6.java
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti latimea dreptunghiului: ");
            int x = scanner.nextInt();
            System.out.println("Introduceti lungimea dreptunghiului: ");
            int y = scanner.nextInt();
            int arieDreptunghi = x*y;
            System.out.println("Aria dreptunghi: "+ arieDreptunghi);
        }


    }
}
