package com.itfactory.FormeGeometrice;

import java.util.Scanner;

public class Dreptunghi {
    Integer latimea;
    Integer lungimea;

    public Dreptunghi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Latime Dreptunghi: ");
        latimea = scanner.nextInt();
        this.latimea=latimea;
        System.out.println("Lungime Dreptunghi: ");
        lungimea = scanner.nextInt();
        this.lungimea=lungimea;
    }
    public int PerimeterDrept(Integer latimea,Integer lungimea) {
        return 2 * latimea + 2 * lungimea;
    }
    public int AriaDrept(Integer latimea,Integer lungimea) {
        return latimea*lungimea;
    }
}
