package model;

public abstract class Produkt {
    String navn;
    double pris;
    int barcode;
    
    public Produkt(String navn, double pris, int barcode) {
        this.navn = navn;
        this.pris = pris;
        this.barcode = barcode;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public double getPris() {
        return pris;
    }
    
    public int getBarcode() {
        return barcode;
    }
    
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    public void setPris(double pris) {
        this.pris = pris;
    }
    
    
}

