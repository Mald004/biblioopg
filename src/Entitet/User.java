package Entitet;

public class User {
    private int idBruger;
    private String fornavn;
    private String efternavn;
    private int adresse;

    public User(int idBruger, String fornavn, int adresse) {
        this.idBruger = idBruger;
        this.fornavn = fornavn;
        this.adresse = adresse;
    }

    public User(String fornavn,String efternavn ,int adresse){
     this.fornavn = fornavn;
     this.efternavn = efternavn;
     this.adresse = adresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getIdBruger() {
        return idBruger;
    }

    public void setIdBruger(int idBruger) {
        this.idBruger = idBruger;
    }


    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }


    @Override
    public String toString() {
        return "User " +
                "idBruger: " + idBruger+"." +
                " Navn: " + fornavn  +"."+
                " Adresse: " + adresse;
    }
}
