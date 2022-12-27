package curs6.teme6Extend;

public class Imbracaminte extends Discount {
    String tipImbracaminte;

    public Imbracaminte(String tipImbracaminte,Double pret,int discount){
        super(pret,discount);
        this.tipImbracaminte=tipImbracaminte;
    }
    public void afiseazaImbracaminte(){
        if (this.tipImbracaminte=="pantaloni" || this.tipImbracaminte=="bluza" || this.tipImbracaminte=="accesoriu"){
            System.out.println("Tip Imbracaminte: "+this.tipImbracaminte+" cu pretul: "+this.pret+"$"+" si discountul: "+this.discount);
            afiseazaDiscount();
        }
        //System.out.println("Tip Imbracaminte "+ this.tipImbracaminte+
        //        "\npret "+this.pret+"Discoun t"+this.discount );
    }
}
