package curs6.teme6abstract;

public class BancaPentruNevoiPersonale extends UnitateBancara{
    @Override
    public void credit(Integer salariu) {
        System.out.println("Creditul este: " + salariu+ " lei ");
    }

    @Override
    public void dobandaCredit(Integer dobanda) {
        System.out.println("Dobanda este: " +dobanda+ " % ");

    }


}
