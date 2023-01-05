package Tema7.Probl_supl;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persoana {
    List<String> cursuri_p;

    public Profesor(String nume,Integer varsta,List<String> cursuri_p) {
        super(nume, varsta);
        this.cursuri_p = cursuri_p;
    }
}
