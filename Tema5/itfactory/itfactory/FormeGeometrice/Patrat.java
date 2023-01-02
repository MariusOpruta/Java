package com.itfactory.FormeGeometrice;

import java.util.Scanner;

public class Patrat {
    Integer latura_p;

    public Patrat(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Latura Patrat: ");
        latura_p = scanner.nextInt();
        this.latura_p=latura_p;
    }
    public int Perimeter(Integer latura_p) {
        return 4*latura_p;
    }
    public int Aria(Integer latura_p){
        return latura_p*latura_p;
    }
}
