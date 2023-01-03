package curs7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class problema4 {
    static class ProblemaA{
        public static void main(String[] args) {
            List<Integer> rasturnat = new ArrayList<>(4);
            List<Integer> simpla = new ArrayList<>(4);
            Scanner scanner = new Scanner(System.in);
            int i;
            int j;
            for (i = 0; i < 4; i++) {
                System.out.println("Valoarea indexului " + i + " este: ");
                j = parseInt(scanner.nextLine());
                simpla.add(j);
            }

            System.out.println("Array-ul este: " + simpla);
            Collections.swap(simpla, 0, 3);
            System.out.println("Rasturnat: " + simpla);
        }



    }

}
