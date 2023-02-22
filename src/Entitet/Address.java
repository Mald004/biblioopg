package Entitet;

public class Address {
    int addressid;
    int postnr;
    String city;

    public Address(int addressid, int postnr, String city) {
        this.addressid = addressid;
        this.postnr = postnr;
        this.city = city;
    }

    public Address( int postnr, String city) {
        this.postnr = postnr;
        this.city = city;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address" +
                "addressid:" + addressid +
                " postnr:" + postnr +
                " city:" + city;
    }
}
