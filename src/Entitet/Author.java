package Entitet;

public class Author {
    int forfatterid;
    String fornavn;
    String efternavn;

    public Author(int forfatterid, String fornavn, String efternavn) {
        this.forfatterid = forfatterid;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public Author(String fornavn, String efternavn) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }


    public int getForfatterid() {
        return forfatterid;
    }

    public void setForfatterid(int forfatterid) {
        this.forfatterid = forfatterid;
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

    @Override
    public String toString() {
        return "Forfatter" +
                " [forfatterid:" + forfatterid+"]"+
                " [fornavn:" + fornavn+"]"+
                " [efternavn:" + efternavn+"]";
    }
}
