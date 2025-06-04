package model;

public class PrivatKunde extends Person {
    private int kundeID;
    
    public PrivatKunde(String navn, String adresse, int tlfNr) {
        super(navn, "", "", tlfNr, adresse);
        this.kundeID = tlfNr;
    }
    
    public PrivatKunde(String fornavn, String efternavn, String email, int tlfNr, String adresse, int kundeID) {
        super(fornavn, efternavn, email, tlfNr, adresse);
        this.kundeID = kundeID;
    }
    
    public int getKundeID() {
        return kundeID;
    }
    
    public void setKundeID(int kundeID) {
        this.kundeID = kundeID;
    }
}