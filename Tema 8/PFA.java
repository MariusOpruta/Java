import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PFA {
    private String cui;
    private String nume;
    private Set<String> coduriCaen;

    public PFA(String cui, String nume, String coduricaen) {
       // super();
        this.cui = cui;
        this.nume = nume;
        this.coduriCaen= Collections.singleton(coduricaen);
    }

    public PFA(String cui) {
        this.cui=cui;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PFA pfa = (PFA) o;
        return cui.equals(pfa.cui) && nume.equals(pfa.nume) && coduriCaen.equals(pfa.coduriCaen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cui, nume, coduriCaen);
    }

    @Override
    public String toString() {
        return "PFA{" +
                "cui='" + cui + '\'' +
                ", nume='" + nume + '\'' +
                ", coduriCaen=" + coduriCaen +
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
        coduriCaen.add(coduriCaen.toString());
        this.coduriCaen = coduriCaen;
    }
}
