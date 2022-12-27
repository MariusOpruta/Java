package com.itfactory.tema3.whilecondition;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul: ");
        int x = scanner.nextInt();
        while( x!=0 ) {
            System.out.println("Am citit: " + x);
            System.out.print("Introdu numarul: ");
            x=scanner.nextInt();
        }
        System.out.println("S-a introdus numarul 0. Ies din bucla");

    }
}
