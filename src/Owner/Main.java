package Owner;

public class Main {

    public static Owner[] allOwners;
    public static int numOwners;
    public static int numProps;

    public static void main(String[] args) {
        Owner[] allOwners = new Owner[5];
    }

    public static void addOwner(Owner o){
        if(numOwners<allOwners.length){
            allOwners[numOwners] = o;
            numOwners++;
        }
    }

    public static void addProp(String n, Prop p){
        for(int i=0; i< numOwners; i++) {
            Owner owner = allOwners[i];
            if (owner.getName().equals(n)) {
                owner.addProp(p);
                numProps++;
            }
        }
    }

    public static int numPropsInCity(Owner[] o, String city){
        int num = 0;
        for(int i=0; i<o.length; i++){
            Owner owner = o[i];
            if(owner != null){
                for(int j = 0; i<owner.getNumProps(); j++){
                    Prop p = owner.getProps()[j];
                    if(p.getCity().equals(city)){
                        num++;
                    }
                }
            }
        }
        return num;
    }

    public static String ownerCheapestProp(Owner[] o){
        float minAllOwners = Float.MAX_VALUE;
        String ownerName = "";
        for(int i=0; i<o.length; i++){
            Owner owner = o[i];
            if(owner!=null) {
                float minOwner = owner.cheapestPrice();
                if (minOwner < minAllOwners) {
                    minAllOwners = minOwner;
                    ownerName = owner.getName();
                }
            }
        }
        return ownerName;
    }

    public static float extendPrices(Owner[] o){
        float minPrice = Float.MAX_VALUE;
        float maxPrice = Float.MIN_VALUE;

        for(int i=0; i<o.length; i++){
            Owner owner = o[i];
            if(owner!=null) {

                float minOwner = owner.cheapestPrice();
                if (minOwner < minPrice) {
                    minPrice = minOwner;
                }

                float maxOwner = owner.expensivePrice();
                if (maxOwner > maxPrice) {
                    maxPrice = maxOwner;
                }
            }
        }
        return maxPrice - minPrice;
    }

    public static int numBoatsMinLength(float f, Owner[] o){
        int n = 0;
        for(int i=0; i<o.length; i++){
            Owner owner = o[i];
            if(owner != null) {
                for (int j = 0; j < owner.getNumProps(); j++) {
                    Prop p = owner.getProps()[j];
                    if(p instanceof Boat) {
                        if (((Boat) p).getLength()>= f) {
                            n++;
                        }
                    }
                }
            }
        }
        return n;
    }

    public static int numHousesWithPool(Owner[] o){
        int n = 0;
        for(int i=0; i<o.length; i++){
            Owner owner = o[i];
            if(owner != null) {
                for (int j = 0; j < owner.getNumProps(); j++) {
                    Prop p = owner.getProps()[j];
                    if(p instanceof House) {
                        if (((House) p).isSwimmingPool()) {
                            n++;
                        }
                    }
                }
            }
        }
        return n;
    }
}
