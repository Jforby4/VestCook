package model;

public class UnikProdukt extends Produkt {
    private String status;

    public UnikProdukt(String navn, double pris, String status, int barcode) {
        super(navn, pris, barcode);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
