package Tema7.Problema5;

public class Insumare implements Task{
    private int i;
    private int j;
    public Insumare(int i, int j) {
        this.i=i;
        this.j=j;
    }

    @Override
    public int execute() {
        System.out.println(this.i+this.j);

        return this.i+this.j;
    }
}
