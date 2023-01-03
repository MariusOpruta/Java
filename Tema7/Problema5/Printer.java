package curs7.Problema5;

public class Printer implements Task{
    String printer;
    @Override
    public void execute() {
        System.out.println(printer);

    }
}
