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
        props[numProps] = p;
        numProps++;
    }

    public float cheapestPrice(){
        float min = props[1].getPrice();
        for (int i = 0; i < props.length; i++){
            if(props[i].getPrice() > min){
                min = props[i].getPrice();
            }
        }
        return min;
    }

    public float expensivePrice(){
        float max = props[1].getPrice();
        for(int i = 0; i <numProps; i++){
            if(props[i].getPrice() < max){
                max = props[i].getPrice();
            }
        }
        return max;
    }

    public float averagePrices(){
        float av = 0;
        for(int i = 0; i<numProps; i++){
            float sum = 0;
            sum = sum + props[i].getPrice();
            av = sum/numProps;
        }
        return av;
    }

    public String cheapestProp(){
        float min= props[1].getPrice();
        String nomMin= "";
        for(int i=0; i<numProps; i++){
            if (props[i].getPrice()< min){
                min= props[i].getPrice();
                nomMin= props[i].getPropID();
            }
        }
        return  nomMin;
    }

    public void sortPropsByPrice(String p){

    }
}
