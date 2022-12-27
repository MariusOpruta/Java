package com.itfactory.tema3.ifcondition;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr ");
        int x = scanner.nextInt();
        boolean valoare= x >= 10;
        if (x>=10){
            System.out.println(valoare+":Numarul este mai mare decat 10 ");
        } else {
            System.out.println(valoare+":Numarul este mai mic decat 10 ");
        }
    }
}
