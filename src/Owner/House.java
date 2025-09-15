package Owner;

public class House extends Prop {

    int numRooms;
    boolean swimmingPool;

    public House(String ID, String address, String city, int numRooms, boolean swimmingPool) {
        super(ID, address, city);
        this.numRooms = numRooms;
        this.swimmingPool = swimmingPool;
    }

    public int getNumRooms() {
        return numRooms;
    }
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
