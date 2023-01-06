package Tema7.Problema5;

public class Printer implements Task{
    String printer;
    public Printer(String printer){
        this.printer=printer;

    }

    public int execute() {
        System.out.println(printer);

        return 0;
    }
}
