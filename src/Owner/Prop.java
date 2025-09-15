package Owner;

public class Prop {

    String propID;
    String address;
    String city;
    float price;

    public Prop(String ID, String address, String city) {
        this.propID = ID;
        this.address = address;
        this.city = city;
    }

    public String getPropID() {
        return propID;
    }
    public void setPropID(String propID) {
        this.propID = propID;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCheaperThan(Prop p){
        return true;
    }

    public boolean samecity(Prop p){
        return true;
    }
}
