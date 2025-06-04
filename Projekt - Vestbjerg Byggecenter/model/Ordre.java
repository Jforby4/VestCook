package model;
import java.util.ArrayList;

public class Ordre {
    private OrdreContainer ordreContainer;
    private SimpelProdukt simpelProdukt;
    private Kopi kopi;
    private int ordreID;
    private String status;
    private String opretDato;
    private PrivatKunde privatKunde;
    private Medarbejder medarbejder;
    private ArrayList<OrdreLinje> ordreLinjer;
    
    public Ordre() {
        this.ordreLinjer = new ArrayList<>();
        this.status = "Oprettet";
        this.opretDato = java.time.LocalDate.now().toString();
    }
    
    public Ordre(int ordreID, String status, String opretDato) {
        this.ordreID = ordreID;
        this.status = status;
        this.opretDato = opretDato;
        this.ordreLinjer = new ArrayList<>();
    }
    
    public void tilfoejOrdrelinje(OrdreLinje ordrelinje) {
        ordreLinjer.add(ordrelinje);
    }
    
    public double beregnTotalPris() {
        double total = 0;
        for (OrdreLinje linje : ordreLinjer) {
            total += linje.getSubtotal();
        }
        return total;
    }
    
    public void setKunde(PrivatKunde kunde) {
        if (kunde instanceof PrivatKunde) {
            this.privatKunde = (PrivatKunde) kunde;
        }
    }
    
    public void setMedarbejder(Medarbejder medarbejder) {
        this.medarbejder = medarbejder;
    }
    
    // Getters
    public int getOrdreID() { return ordreID; }
    public String getStatus() { return status; }
    public String getOpretDato() { return opretDato; }
    public PrivatKunde getPrivatKunde() { return privatKunde; }
    public Medarbejder getMedarbejder() { return medarbejder; }
    public ArrayList<OrdreLinje> getOrdreLinjer() { return ordreLinjer; }
}
