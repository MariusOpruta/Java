package Tema7.Probl_supl;

public class Curs {
    String nume_curs;
    Integer id_curs;

    public Curs(String nume_curs,Integer id_curs){
        this.nume_curs=nume_curs;
        this.id_curs=id_curs;

    }

    public String getNume_curs() {
        return nume_curs;
    }

    public void setNume_curs(String nume_curs) {
        this.nume_curs = nume_curs;
    }

    public Integer getId_curs() {
        return id_curs;
    }

    public void setId_curs(Integer id_curs) {
        this.id_curs = id_curs;
    }
}
