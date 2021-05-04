package Property;

public class House extends Property  {
    private int numberOfRooms = 1;
    private boolean hasBalcony;

    public House(String city, int price, int numberOfRooms) {
        super(city, price);
        if (numberOfRooms >= 1)
            this.numberOfRooms = numberOfRooms;
    }

    public House(String city, int price) {
        super(city, price);
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if (numberOfRooms >= 1)
            this.numberOfRooms = numberOfRooms;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}
