package model;


public class SimpelProdukt extends Produkt {
    private int lagerAntal;
    
    public SimpelProdukt(String navn, double pris, int lagerAntal, int barcode) {
        super(navn, pris, barcode);
        this.lagerAntal = lagerAntal;
    }
    
    public int getLagerAntal() {
        return lagerAntal;
    }
    
    public void setLagerAntal(int lagerAntal) {
        this.lagerAntal = lagerAntal;
    }
    
    public void reduceStock(int antal) {
        if (lagerAntal >= antal) {
            lagerAntal -= antal;
        }
    }
}
