package model;

public class OrdreLinje {
    private Produkt produkt;
    private int antal;
    private double subtotal;
    
    public OrdreLinje(Produkt produkt, int antal) {
        this.produkt = produkt;
        this.antal = antal;
        this.subtotal = produkt.getPris() * antal;
    }
    
    public Produkt getProdukt() {
        return produkt;
    }
    
    public int getAntal() {
        return antal;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    
    public double beregnSubtotal() {
        return produkt.getPris() * antal;
    }
}
