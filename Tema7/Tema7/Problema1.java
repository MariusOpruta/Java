package Tema7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Problema1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lungimea listei este: ");
        int lungime = parseInt(scanner.nextLine());
        List<Integer> numere = new ArrayList<>(lungime);
        int i;
        for (i=0;i<lungime;i++) {
            Random j = new Random();
            numere.add(j.nextInt(20));
            System.out.println("Lista numere cu indexul: " + i+" are valoarea in lista de:  "+numere.get(i));
        }
        System.out.println("Lista este: "+numere);
    }
}
