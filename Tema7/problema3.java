package curs7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        List<String> cuvinte = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Valoarea indexului " + i);
            String j = (scanner.nextLine());
            if (j.contains("a")) {
                System.out.println("Nu se va introduce!");
            } else {
                cuvinte.add(j);
            }

        }
        System.out.println("Array-ul este "+cuvinte);
    }

}

