package com.itfactory.tema3.optional;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie nr:");
        int x = scanner.nextInt();
        while (x % 7 != 0) {
            x = scanner.nextInt();
        }

    }
}
