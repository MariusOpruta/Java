package curs6.teme6Polimorfism;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
       UnitateBancara unitateBancara=null;
       DatePersonale datePersonale=new DatePersonale();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Scrie numele: ");
        datePersonale.Nume=scanner.nextLine();
        System.out.print("Varsta: ");
        datePersonale.Varsta=scanner.nextInt();
        System.out.print("cnp: ");
        datePersonale.cnp=scanner.nextInt();
        System.out.print("Salar: ");
        datePersonale.salariu=scanner.nextInt();
        if (datePersonale.getVarsta() >40){
            unitateBancara=new BancaPentruNevoiPersonale();
            unitateBancara.credit(datePersonale.getSalariu() *100);
            unitateBancara.dobandaCredit(8);
        } else if (datePersonale.getVarsta() >=18 & datePersonale.getVarsta() <=40) {
            unitateBancara=new BancaPentruLocuinte();
            unitateBancara.credit(datePersonale.getSalariu() *10);
            unitateBancara.dobandaCredit(5);
        }else {
            System.out.println("Persoana nu este eligibila pentru un credit");
        }
    }
}
