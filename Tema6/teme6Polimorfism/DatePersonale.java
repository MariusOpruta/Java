package curs6.teme6Polimorfism;

public class DatePersonale {
    String Nume;
    Integer Varsta;
    int cnp;
    int salariu;
    public DatePersonale(){
        this.Nume=Nume;
        this.Varsta=Varsta;
        this.cnp=cnp;
        this.salariu=salariu;
    }
    public void Persoana(){
        System.out.println("Datele persoanei sunt: "+Nume+" "+Varsta+" "+cnp+" "+salariu);
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public Integer getVarsta() {
        return Varsta;
    }

    public void setVarsta(Integer varsta) {
        Varsta = varsta;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
