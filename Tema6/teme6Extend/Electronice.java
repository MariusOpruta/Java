package curs6.teme6Extend;

public class Electronice extends Discount {

    String tipProdus;
    Integer voltaj;
    public Electronice(String tipProdus,Integer voltaj,double pret,int discount){
        super(pret,discount);
        this.voltaj=voltaj;
        this.tipProdus=tipProdus;
    }
    public void afiseazaElectronice(){
        if (this.voltaj>=220 & this.voltaj<=240){
            System.out.println("Tip produs electronic: "+this.tipProdus+" cu voltajul "+this.voltaj+" cu pretul: "+this.pret+"$"+" si discountul: "+this.discount);
            afiseazaDiscount();
        }else{
            System.out.println("Produsul "+this.tipProdus+ " Cu Voltajul "+this.voltaj+" nu poate fi folosit la o priza ce prevede reglementarile europene");
        }
    }
}
