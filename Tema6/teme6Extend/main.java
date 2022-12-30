package curs6.teme6Extend;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Imbracaminte imbracaminte=new Imbracaminte("pantaloni",300.0,10);
        imbracaminte.afiseazaImbracaminte();
       Imbracaminte imbracaminte1=new Imbracaminte("bluza",240.0,20);
        imbracaminte1.afiseazaImbracaminte();
       Imbracaminte imbracaminte2=new Imbracaminte("accesoriu",120.0,30);
        imbracaminte2.afiseazaImbracaminte();
       IngrijirePersonala ingrijirePersonala=new IngrijirePersonala("aparat de ras",120.0,10);
        ingrijirePersonala.afiseazaReturnat();
       IngrijirePersonala ingrijirePersonala1=new IngrijirePersonala("aparat de tuns",120.0,10);
        ingrijirePersonala1.afiseazaReturnat();
       Electronice electronice = new Electronice("Televizor",220,1200.99,10);
        electronice.afiseazaElectronice();
       Electronice electronice1 = new Electronice("Radio",210,1200.99,10);
        electronice1.afiseazaElectronice();
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Numele produsului(imbracaminte): ");
//        String tipImbracaminte=scanner.nextLine();

    }
}

