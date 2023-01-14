import java.util.Date;
import java.util.Objects;

public class Factura extends PFA {
    Integer nrFactura;
    Integer valoareFaraTVA;
    String denumireServiciuPrestat;
    String data;

    public Factura(String cui, Integer nrFactura, Integer valoareFaraTVA, String denumireServiciuPrestat, String data) {
        super(cui);
        this.nrFactura = nrFactura;
        this.valoareFaraTVA = valoareFaraTVA;
        this.denumireServiciuPrestat = denumireServiciuPrestat;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Factura factura = (Factura) o;
        return nrFactura.equals(factura.nrFactura) && valoareFaraTVA.equals(factura.valoareFaraTVA) && denumireServiciuPrestat.equals(factura.denumireServiciuPrestat) && data.equals(factura.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nrFactura, valoareFaraTVA, denumireServiciuPrestat, data);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrFactura=" + nrFactura +
                ", valoareFaraTVA=" + valoareFaraTVA +
                ", denumireServiciuPrestat='" + denumireServiciuPrestat + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public Integer getNrFactura() {
        return nrFactura;
    }

    public void setNrFactura(Integer nrFactura) {
        this.nrFactura = nrFactura;
    }

    public Integer getValoareFaraTVA() {
        return valoareFaraTVA;
    }

    public void setValoareFaraTVA(Integer valoareFaraTVA) {
        this.valoareFaraTVA = valoareFaraTVA;
    }

    public String getDenumireServiciuPrestat() {
        return denumireServiciuPrestat;
    }

    public void setDenumireServiciuPrestat(String denumireServiciuPrestat) {
        this.denumireServiciuPrestat = denumireServiciuPrestat;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
