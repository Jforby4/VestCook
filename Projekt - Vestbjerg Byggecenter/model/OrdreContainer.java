package model;
import java.util.ArrayList;

public class OrdreContainer {
    private static OrdreContainer instance;
    private ArrayList<Ordre> ordrer;

    private OrdreContainer() {
        ordrer = new ArrayList<>();
    }

    public static OrdreContainer getInstance() {
        if (instance == null) {
            instance = new OrdreContainer();
        }
        return instance;
    }

    public void tilfoejOrdre(Ordre o) {
        ordrer.add(o);
    }
    
    public ArrayList<Ordre> getAlleOrdrer() {
        return new ArrayList<>(ordrer);
    }
    
    public Ordre findOrdre(int ordreID) {
        for (Ordre ordre : ordrer) {
            if (ordre.getOrdreID() == ordreID) {
                return ordre;
            }
        }
        return null;
    }
}
