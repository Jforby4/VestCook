package model;

public class Kopi {
    private String produktNavn;
    private String tilstand;
    private int stelnummer;
    
    public Kopi(String produktNavn, String tilstand, int stelnummer) {
        this.produktNavn = produktNavn;
        this.tilstand = tilstand;
        this.stelnummer = stelnummer;
    }
    
    public String getProduktNavn() {
        return produktNavn;
    }
    
    public String getTilstand() {
        return tilstand;
    }
    
    public int getStelnummer() {
        return stelnummer;
    }
    
    public String getNavn() {
        return produktNavn;
    }
}
