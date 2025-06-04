package model;
import java.util.ArrayList;

public class UnikProduktContainer {
    private static UnikProduktContainer instance;
    private ArrayList<UnikProdukt> unikkeProdukter;

    private UnikProduktContainer() {
        unikkeProdukter = new ArrayList<>();
        // Herunder tilføjes nye unikke produkter
        //new = etc.
    }

    public static UnikProduktContainer getInstance() {
        if (instance == null) {
            instance = new UnikProduktContainer();
        }
        return instance;
    }

    public Kopi findKopi(String navn) {
        for (UnikProdukt produkt : unikkeProdukter) {
            if (produkt.getNavn().equalsIgnoreCase(navn)) {
                // Opret en Kopi af et Unik Produkt
                return new Kopi(produkt.getNavn(), produkt.getStatus(), 
                              (int)(Math.random() * 10000)); // Tilfældigt stelnummer
            }
        }
        return null;
    }
    
    public void tilfoejUnikProdukt(UnikProdukt produkt) {
        unikkeProdukter.add(produkt);
    }
}
