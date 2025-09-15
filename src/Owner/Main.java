package Owner;

public class Main {

    Owner[] allOwners;
    int numOwners;
    int numProps;
    Prop[] props;

    public static void main(String[] args) {
        Owner[] allOwners = new Owner[5];
    }

    public void addOwner(Owner o){

    }

    public void addProp(String n, Prop p){
        if(numProps<props.length){
            props[numProps] = p;
            numProps++;
        }
    }

    public int numPropsInCity(Owner[] o, String s){
        int num = 0;
        return num;
    }

    public String ownerCheapestProp(Owner[] o){
    }

    public float extendPrices(Owner[] o){
    }

    public int numBoatsMinLength(float f, Owner[] o){
    }

    public int numHousesWithPool(Owner[] o){
        
    }
}
