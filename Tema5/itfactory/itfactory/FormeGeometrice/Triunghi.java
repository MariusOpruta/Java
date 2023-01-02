package com.itfactory.FormeGeometrice;

import java.util.Scanner;

public class Triunghi {

    Integer latura1;
    Integer latura2;
    Integer latura3;



    public Triunghi() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Latura1 Triunghi: ");
        latura1 = scanner.nextInt();
        this.latura1=latura1;
        System.out.println("Latura2 Triunghi: ");
        latura2 = scanner.nextInt();
        this.latura2=latura2;
        System.out.println("Latura3 Triunghi: ");
        latura3 = scanner.nextInt();
        this.latura3=latura3;

    }

    public int Perimeter(Integer latura1, Integer latura2, Integer latura3) {
        return latura1+latura2+latura3;
    }
}
