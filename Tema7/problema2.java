package curs7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class problema2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lungimea listei este: ");
        int lungime = parseInt(scanner.nextLine());
        List<String> litere = new ArrayList<>(lungime);
        int i;
        for (i=0;i<lungime;i++) {
            System.out.println("Valoarea indexului "+i);
            String j = (scanner.nextLine());
            litere.add(j);
        }
        System.out.println("Lista este: "+litere);
    }
}
