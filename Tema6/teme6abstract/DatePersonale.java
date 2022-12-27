package curs6.teme6abstract;

public class DatePersonale {


    String Nume;
    Integer Varsta;
    int cnp;
    int salariu;
    private String nume;

    public void Personale(String Nume, Integer Varsta, int cnp, int salariu){
        this.Nume=Nume;
        this.Varsta=Varsta;
        this.cnp=cnp;
        this.salariu=salariu;
    }

    public String getNume() {
        return getNume();
    }

    public void setNume(String s) {
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
