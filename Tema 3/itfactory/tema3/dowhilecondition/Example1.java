package com.itfactory.tema3.dowhilecondition    ;

import java.util.Scanner;

public class Example1 {
    private static int anInt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int x = scanner.nextInt();
        do {
            x = scanner.nextInt();

        } while (x!=0);
        System.out.println("Am iesit din program");
    }
}
