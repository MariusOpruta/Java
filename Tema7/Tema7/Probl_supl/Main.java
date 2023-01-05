package Tema7.Probl_supl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elev elev=new Elev("andrei",12, List.of("matematica", "romana", "geografie","astronomie"));
        Profesor profesor=new Profesor("ion",45,List.of("italiana", "romana", "franceza","matematica"));
        System.out.println("Cursuri elev: "+elev.cursuri_e);
        System.out.println("Cursuri prof: "+profesor.cursuri_p);
        int i;
        for(i=0;i<4;i++){
            if (elev.cursuri_e.contains(profesor.cursuri_p.get(i))){
                System.out.println("Elevul: "+elev.getNume()+" are ore cu profu "+profesor.getNume()+" la materia "+elev.cursuri_e.get(i));
            }else {
                System.out.println("Elevul: "+elev.getNume()+" nu are ore cu profu "+profesor.getNume());
            }

        }

        Curs curs=new Curs("matematica",1);

        if(elev.cursuri_e.contains(curs.getNume_curs()) && profesor.cursuri_p.contains(curs.getNume_curs())){
            System.out.println("Au acelasi curs ");

        }else {
            System.out.println("Nu au acelasi curs");
        }
    }
}
