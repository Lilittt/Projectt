package Property;

public class Property implements Comparable<Property> {
    private String city;
    private int price = 5000;
    private Human owner;
    private boolean isRenovated;

    public void renovate() {
        isRenovated = true;
        price += 5000;
    }

    public void sell(Human toWhom) {
        owner = toWhom;
    }

    @Override
    public String toString() {
        return "{" + city + "," + price + "," + owner + "}";
    }

    public Property() {
    }

    public Property(String city, int price) {
        this.city = city;
        if (price >= 5000)
            this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 5000)
            this.price = price;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public boolean isRenovated() {
        return isRenovated;
    }

    public void setRenovated(boolean renovated) {
        isRenovated = renovated;
    }

    @Override
    public int compareTo(Property o) {
        if (price > o.price)
            return 1;
        if (price < o.price)
            return -1;
        return 0;
    }
}
