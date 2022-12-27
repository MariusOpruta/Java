package curs6.teme6Extend;

public class Discount {

    double pret;
    int discount;
    public Discount(double pret,int discount){
        this.pret=pret;
        this.discount=discount;
    }
    public void afiseazaDiscount(){
        System.out.println("Noul pret dupa aplicare discount va fi: "+(this.pret-this.pret*this.discount/100)+"$");

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
