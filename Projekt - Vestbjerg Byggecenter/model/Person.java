package model;

public abstract class Person {
    private String fornavn;
    private String efternavn;
    private String email;
    private int tlfNr;
    private String adresse;
    
    public Person() {
        // Default constructor
    }
    
    public Person(String fornavn, String efternavn, String email, int tlfNr, String adresse) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.email = email;
        this.tlfNr = tlfNr;
        this.adresse = adresse;
    }
    
    // Getters and setters
    public String getFornavn() { return fornavn; }
    public String getEfternavn() { return efternavn; }
    public String getEmail() { return email; }
    public int getTlfNr() { return tlfNr; }
    public String getAdresse() { return adresse; }
    
    public void setFornavn(String fornavn) { this.fornavn = fornavn; }
    public void setEfternavn(String efternavn) { this.efternavn = efternavn; }
    public void setEmail(String email) { this.email = email; }
    public void setTlfNr(int tlfNr) { this.tlfNr = tlfNr; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
}