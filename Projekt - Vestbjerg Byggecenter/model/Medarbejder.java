package model;

public class Medarbejder extends Person {
    private String rolle;
    private int id;
    
    public Medarbejder(String rolle, int id, String navn) {
        super(navn, "", "", 0, ""); 
        this.rolle = rolle;
        this.id = id;
    }
    
    public Medarbejder(String rolle, int id, String fornavn, String efternavn, String email, int tlfNr, String adresse) {
        super(fornavn, efternavn, email, tlfNr, adresse);
        this.rolle = rolle;
        this.id = id;
    }
    
    public String getRolle() {
        return rolle;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNavn() {
        return getFornavn() + " " + getEfternavn();
    }
    
    public void setRolle(String rolle) {
        this.rolle = rolle;
    }
}