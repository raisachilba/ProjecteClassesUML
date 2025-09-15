package Owner;

public class Owner {

    String name;
    String address;
    Prop[] props;
    int numProps;

    public Owner(String name, String address, Prop[] props, int numProps) {
        this.name = name;
        this.address = address;
        this.props = new Prop[5];
        this.numProps = numProps;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Prop[] getProps() {
        return props;
    }
    public void setProps(Prop[] props) {
        this.props = props;
    }

    public int getNumProps() {
        return numProps;
    }
    public void setNumProps(int numProps) {
        this.numProps = numProps;
    }

    public void addProp(Prop p){

    }

    public float cheapestPrice(float ch){
        return ch;
    }

    public float expensivePrice(float ex){
        return ex;
    }

    public float averagePrices(float av){
        return av;
    }

    public String cheapestProp(String n){
        return n;
    }

    public void sortPropsByPrice(String p){

    }
}
