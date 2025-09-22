package Owner;

public class Boat extends Prop{

    float length;
    boolean navigable;

    public Boat(String ID, String address, String city, float length) {
        super(ID, address, city);
        this.length = length;
        this.navigable = true;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public boolean isNaviigable() {
        return navigable;
    }
    public void setNaviigable(boolean naviigable) {
        this.navigable = naviigable;
    }
}
