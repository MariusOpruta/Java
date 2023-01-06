package Tema7.Problema5;
//import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[]args) {
        List Task = new ArrayList<>();
        Printer printer = new Printer("printer");
        printer.execute();
        Insumare insumare = new Insumare(2,3);
        insumare.execute();
        Random j = new Random();
        int i;
        double k=j.nextDouble();
        System.out.println(k);
        for(i=0;i<10;i++){
            if (k == 0.0){
                Task.add(printer.execute());
            } else if (k==1.0) {
                Task.add(insumare.execute());
            }
        }
        System.out.println(Task);
    }
}
