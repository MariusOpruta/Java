package com.itfactory.FormeGeometrice;

import java.io.PrintStream;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Triunghi laturi =new Triunghi();
        System.out.println("Perimetrul este: "+laturi.Perimeter(laturi.latura1, laturi.latura2,laturi.latura3));
        Patrat laturi_patrat=new Patrat();
        System.out.println("Perimetrul patratului este: "+laturi_patrat.Perimeter(laturi_patrat.latura_p));
        System.out.println("Aria Patratului: "+laturi_patrat.Aria(laturi_patrat.latura_p));
        Dreptunghi laturi_dr =new Dreptunghi();
        System.out.println("Perimetrul dreptunghiului este: "+laturi_dr.PerimeterDrept(laturi_dr.latimea,laturi_dr.lungimea));
        System.out.println("Aria Patratului: "+laturi_dr.PerimeterDrept(laturi_dr.latimea,laturi_dr.lungimea));
    }


}
