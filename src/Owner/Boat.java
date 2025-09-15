package Owner;

public class Boat extends Prop{

    float length;
    boolean naviigable;

    public Boat(String ID, String address, String city, float length, boolean naviigable) {
        super(ID, address, city);
        this.length = length;
        this.naviigable = naviigable;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public boolean isNaviigable() {
        return naviigable;
    }
    public void setNaviigable(boolean naviigable) {
        this.naviigable = naviigable;
    }
}
