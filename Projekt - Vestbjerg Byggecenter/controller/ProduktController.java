package controller;
import model.*;

public class ProduktController {
    private UnikProduktContainer unikProduktContainer;
    private SimpelProduktContainer simpelProduktContainer;

    public ProduktController() {
        unikProduktContainer = UnikProduktContainer.getInstance();
        simpelProduktContainer = SimpelProduktContainer.getInstance();
    }

    public Produkt findProdukt(String navn) {
        SimpelProdukt simpelProdukt = simpelProduktContainer.findProdukt(navn);
        if (simpelProdukt != null) {
            return simpelProdukt;
        }

        Kopi kopi = unikProduktContainer.findKopi(navn);
        if (kopi != null) {
            return null; 
        }

        return null;
    }

    public Produkt findProduktByBarcode(int barcode) {
        SimpelProdukt simpelProdukt = simpelProduktContainer.findProduktByBarcode(barcode);
        if (simpelProdukt != null) {
            return simpelProdukt;
        }
        return null;
    }
}
