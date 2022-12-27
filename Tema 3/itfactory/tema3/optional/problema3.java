package com.itfactory.tema3.optional;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        String userInput;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("*****Optiuni valavile*****");
            System.out.println("*. Apasa 1 pentru optiunea 1");
            System.out.println("*. Apasa 2 pentru optiunea 2");
            System.out.println("*. Apasa 3 pentru optiunea 3");


            System.out.println("Alege optiunea:");
            userInput = scanner.next();
            switch (userInput){
                case "1":
                    System.out.println("Alegeti un numar de la 1 la 10: ");
                    int x = scanner.nextInt();
                    if (x<=0 || x>=10){
                        System.out.println("Numarul nu se afla in interval");
                    }else{
                        System.out.println("Yeeeeei ..ai ales corect");
                    }
                    break;
                case "2":
                    System.out.println("Scrie un numar: ");
                    x = scanner.nextInt();
                    System.out.println("Scrie al doilea numar: ");
                    int y = scanner.nextInt();
                    int suma = x+y;
                    System.out.println("Suma lor este:"+suma);
                    break;
                case "3":
                    System.out.println("Scrie un numar pozitiv: ");
                    x = scanner.nextInt();
                    if (x>=0){
                       while (x>=0){
                           System.out.println(x);
                           x--;
                       }
                    }else{
                        System.out.println("Numar negativ");
                    }
                    break;

                default:
                    System.out.println("Ati ales gresit");

            }

    }
}
}

