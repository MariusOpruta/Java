package com.itfactory.tema3.dowhilecondition;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numarul initial: ");
        int x = scanner.nextInt();
        do {
            System.out.print("Introduceti noul numar: ");
            int y = scanner.nextInt();
            System.out.println("S-a citit numarul: " + y);
            x = x + y; //x += y este un mod mai simplu de a-l aduna pe y la x.
            System.out.println("Am obtinut numarul: " + x);
            System.out.println("--------------------------");
        } while (x <= 50);

        System.out.println("Am iesit din bucla");
    }
}
