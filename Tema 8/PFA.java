public class PFA {
    private String cui;
    private String denumire;
    private Set<String> coduriCaen;
    public PFA(String cui, String denumire, String coduriCaen){
        this.cui=cui;
        this.denumire=denumire;
        this.coduriCaen=coduriCaen;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PFA{" +
                "cui='" + cui + '\'' +
                ", denumire='" + denumire + '\'' +
                ", coduriCaen=" + coduriCaen +
                '}';
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Set<String> getCoduriCaen() {
        return coduriCaen;
    }

    public void setCoduriCaen(Set<String> coduriCaen) {
        this.coduriCaen = coduriCaen;
    }
}
