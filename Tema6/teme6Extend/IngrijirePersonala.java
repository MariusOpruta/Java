package curs6.teme6Extend;

public class IngrijirePersonala extends Discount {
    String tipProdus;

    public IngrijirePersonala(String tipProdus, double pret,int discount){
        super(pret,discount);
        this.tipProdus=tipProdus;
    }
    public void afiseazaReturnat(){
        if (this.tipProdus=="aparat de ras"){
            System.out.println("Tip Produs Ingrijire personala: "+this.tipProdus+" Pret: "+this.pret+" $ "+"Discount: "+this.discount+" Nu este Returnabil ");
            afiseazaDiscount();
        }else{
            this.discount=0;
            System.out.println("Tip Produs Ingrijire personala: "+this.tipProdus+" Pret: "+this.pret+" $ "+"Discount: "+this.discount+"\nESTE RETURNABIL NU SE APLICA DISCOUNT");
        }

    }

}
