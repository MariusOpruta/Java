package Tema7.Problema5;
//import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[]args) {
        List Task = new ArrayList();
        Printer printer = new Printer();
        Insumare insumare = new Insumare();
//        Random j = new Random(1);
        double i;
        for(i=0;i<10;i++){
            if (Math.random() == 0.0){
                Task.add(printer);
                System.out.println(Math.random());
            } else if (Math.random()==1.0) {
                Task.add(insumare);
            }
        }
        System.out.println(Task);
    }
}
