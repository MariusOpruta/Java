package curs6.teme6Polimorfism;

public class BancaPentruLocuinte implements UnitateBancara{
    @Override
    public void credit(Integer salariu) {
        System.out.println("Creditul este: " + salariu+ " % ");
    }

    @Override
    public void dobandaCredit(Integer dobanda) {
        System.out.println("Dobanda este: " +dobanda+ " % ");

    }
}
