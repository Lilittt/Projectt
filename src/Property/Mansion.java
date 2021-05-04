package Property;

public class Mansion extends House {
    private int numberOfFloors = 2;
    private boolean hasPool;

    public Mansion(String city, int price, int numberOfFloors) {
        super(city, price);
        if (numberOfFloors >= 2)
            this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        if (numberOfFloors >= 2)
            this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }
}
