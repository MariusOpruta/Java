package Tema7.Problema6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cate produse se vor citi: ");
        int n = scanner.nextInt();
        List<String>stoc = new ArrayList<>(n);
        Produs produs=new Produs();
        produs.setDenumire(scanner.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Scrie denumire produs: ");
            produs.setDenumire(scanner.nextLine());
            if (stoc.contains(produs.getDenumire())){
                System.out.println("Produsul exista!");
            }
            else {
                stoc.add(produs.getDenumire());
            }
        }
        System.out.println("Lista este: "+stoc);


    }
}

//nu stiu ce sa fac cu pretul
//doar daca creez o alta lista