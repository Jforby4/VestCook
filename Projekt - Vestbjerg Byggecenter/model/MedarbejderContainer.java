package model;
import java.util.ArrayList;

public class MedarbejderContainer {
    private static MedarbejderContainer instance;
    private ArrayList<Medarbejder> medarbejdere;

    private MedarbejderContainer() {
        medarbejdere = new ArrayList<>();
        // Tilføj testdata
        medarbejdere.add(new Medarbejder("Sælger", 1, "Frederik Korsgaard"));
        medarbejdere.add(new Medarbejder("Sælger", 2, "Jonathan Nicolai Dyndgaard"));
        medarbejdere.add(new Medarbejder("Sælger", 3, "Jakob Førby Pedersen"));
    }

    public static MedarbejderContainer getInstance() {
        if (instance == null) {
            instance = new MedarbejderContainer();
        }
        return instance;
    }

    public Medarbejder getID(int id) {
        for (Medarbejder medarbejder : medarbejdere) {
            if (medarbejder.getId() == id) {
                return medarbejder;
            }
        }
        return null;
    }
    
    public void tilfoejMedarbejder(Medarbejder medarbejder) {
        medarbejdere.add(medarbejder);
    }
}