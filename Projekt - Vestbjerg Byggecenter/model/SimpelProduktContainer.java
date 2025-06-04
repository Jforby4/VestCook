package model;
import java.util.ArrayList;

public class SimpelProduktContainer {
    private static SimpelProduktContainer instance;
    private ArrayList<SimpelProdukt> simpleProdukter;

    private SimpelProduktContainer() {
        simpleProdukter = new ArrayList<>();
        // Tilføj produkter - Navn, pris, antal på lager, barcode
        simpleProdukter.add(new SimpelProdukt("Hammer", 199.99, 50, 1));
        simpleProdukter.add(new SimpelProdukt("Skruetrækker", 89.99, 100, 2));
        simpleProdukter.add(new SimpelProdukt("Sav", 299.99, 25, 3));
        simpleProdukter.add(new SimpelProdukt("Svensknøgle", 149.99, 70, 4));
        simpleProdukter.add(new SimpelProdukt("Unbrakonøglesæt", 99.99, 150, 5));
        simpleProdukter.add(new SimpelProdukt("Knibtang", 89.99, 60, 6));
        simpleProdukter.add(new SimpelProdukt("Vaterpas", 49.99, 83, 7));
        simpleProdukter.add(new SimpelProdukt("Hobbykniv", 39.99, 137, 8));
    }

    public static SimpelProduktContainer getInstance() {
        if (instance == null) {
            instance = new SimpelProduktContainer();
        }
        return instance;
    }

    public SimpelProdukt findProdukt(String navn) {
        for (SimpelProdukt produkt : simpleProdukter) {
            if (produkt.getNavn().equalsIgnoreCase(navn)) {
                return produkt;
            }
        }
        return null;
    }
    
     public SimpelProdukt findProduktByBarcode(int barcode) {
        for (SimpelProdukt produkt : simpleProdukter) {
            if (produkt.getBarcode() == barcode) {
                return produkt;
            }
        }
        return null;
    }
    
    public void tilfoejProdukt(SimpelProdukt produkt) {
        simpleProdukter.add(produkt);
    }
    
    public ArrayList<SimpelProdukt> getAlleProdukter() {
        return new ArrayList<>(simpleProdukter);
    }
}
