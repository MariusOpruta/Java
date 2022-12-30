package curs6.teme6abstract;

public class BancaPentruNevoiPersonale implements UnitateBancara {
    public double calculCredit(DatePersonale datePersonale){
        System.out.println("Salariul Personaei este: "+datePersonale.getSalariu());
        double creditMaxim = datePersonale.getSalariu()*10;
        double procentDobanda = creditMaxim * calculDobanda(datePersonale);
        System.out.println("Valoarea dobanzii este: "+procentDobanda);
        return creditMaxim+procentDobanda;
    }

    public double calculDobanda(DatePersonale datePersonale){
        return 0.08;
    }


}
