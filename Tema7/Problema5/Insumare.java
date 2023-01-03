package curs7.Problema5;

public class Insumare implements Task{

    @Override
    public void execute(Integer i,Integer j){
        System.out.println("Suma este "+(i+j));
    }

    @Override
    public void execute() {

    }
}
