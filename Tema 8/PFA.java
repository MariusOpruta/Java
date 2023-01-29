

import java.util.Objects;
import java.util.Set;

public class PFA {
    private String cui;
    private String nume;
    private Set<String> coduriCaen;

    public PFA(String cui, String nume, Set<String> coduriCaen) {
        this.cui = cui;
        this.nume = nume;
        this.coduriCaen= coduriCaen;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PFA pfa = (PFA) o;
        return cui.equals(pfa.cui) && nume.equals(pfa.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cui, nume);
    }

    @Override
    public String toString() {
        return "PFA{" +
                "cui='" + cui + '\'' +
                ", nume='" + nume + '\'' +
                ", coduricaen"+ coduriCaen+
                '}';
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Set<String> getCoduriCaen() {

        return coduriCaen;
    }



    public void setCoduriCaen(Set<String> coduriCaen) {
        this.coduriCaen = coduriCaen;
    }
}