package com.itfactory.laptop;

public class Laptop {
    String marca;
    String Culoare;
    double dimensiune_ecran;
    long capacitate_stocare;
    long memorie_ram;

    public Laptop() {
        this.marca = "Assus";
        this.Culoare = "Negru";
        this.dimensiune_ecran = 15.6;
        this.capacitate_stocare = 256;
        this.memorie_ram = 16;

    }

    public String Laptop() {

                System.out.println("Marca: "+getMarca() );
                System.out.println("Culoare: "+getCuloare());
                System.out.println(("Dimensiune Ecran"+getDimensiune_ecran()));
                System.out.println("Capacitate de stocare: "+getCapacitate_stocare());
                System.out.println("Memorie ram: "+getMemorie_ram());
    return(marca) ;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public double getDimensiune_ecran() {
        return dimensiune_ecran;
    }

    public void setDimensiune_ecran(double dimensiune_ecran) {
        this.dimensiune_ecran = dimensiune_ecran;
    }

    public long getCapacitate_stocare() {
        return capacitate_stocare;
    }

    public void setCapacitate_stocare(long capacitate_stocare) {
        this.capacitate_stocare = capacitate_stocare;
    }

    public long getMemorie_ram() {
        return memorie_ram;
    }

    public void setMemorie_ram(long memorie_ram) {
        this.memorie_ram = memorie_ram;
    }
}
