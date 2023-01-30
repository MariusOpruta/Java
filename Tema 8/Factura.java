package curs8;

import java.util.Objects;

public class Factura {
    Integer nrFactura;
    Integer valoareFaraTVA;
    String denumireServiciuPrestat;
    String data;

    PFA cui;


    public Factura(PFA cui, int nrFactura, int valoareFaraTVA, String denumireServiciuPrestat, String data) {
        this.nrFactura = nrFactura;
        this.valoareFaraTVA = valoareFaraTVA;
        this.denumireServiciuPrestat = denumireServiciuPrestat;
        this.data = data;
        this.cui = cui;

    }

    public Factura(int i, int nrFactura, int valoareFaraTVA, String apa_plata, String data) {
        this.nrFactura = nrFactura;
        this.valoareFaraTVA = valoareFaraTVA;
        this.denumireServiciuPrestat = denumireServiciuPrestat;
        this.data = data;
    }

    public String toString() {
        return "Factura{" +
                "nrFactura=" + nrFactura +
                ", valoareFaraTVA=" + valoareFaraTVA +
                ", denumireServiciuPrestat='" + denumireServiciuPrestat + '\'' +
                ", data='" + data + '\'' +
                ", cui='" + this.cui + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return nrFactura.equals(factura.nrFactura) && valoareFaraTVA.equals(factura.valoareFaraTVA) && denumireServiciuPrestat.equals(factura.denumireServiciuPrestat) && Objects.equals(data, factura.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrFactura, valoareFaraTVA, denumireServiciuPrestat);
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

    public PFA getCui() {
        return cui;
    }

    public void setCui(PFA cui) {
        this.cui = cui;
    }
}
