package model;
import java.util.ArrayList;

public class KundeContainer {
    private static KundeContainer instance;
    private ArrayList<PrivatKunde> kunder;

    private KundeContainer() {
        kunder = new ArrayList<>();
        // Add some test data
        kunder.add(new PrivatKunde("Jens Jensen", "Vesterbrogade 1", 12345678));
        kunder.add(new PrivatKunde("Jon Crispy", "Nørrebrogade 2", 87654321));
    }

    public static KundeContainer getInstance() {
        if (instance == null) {
            instance = new KundeContainer();
        }
        return instance;
    }

    public PrivatKunde getTlfNr(int tlfNr) {
        for (PrivatKunde kunde : kunder) {
            if (kunde.getTlfNr() == tlfNr) {
                return kunde;
            }
        }
        return null;
    }

    public void tilfoejKunde(PrivatKunde k) {
        kunder.add(k);
    }
    
    public ArrayList<PrivatKunde> getAlleKunder() {
        return new ArrayList<>(kunder);
    }
}