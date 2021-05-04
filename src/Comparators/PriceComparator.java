package Comparators;

import Property.Property;

import java.util.Comparator;

public class PriceComparator implements Comparator<Property> {
    @Override
    public int compare(Property o1, Property o2) {
        if (o1.getPrice() > o2.getPrice())
            return 1;
        if (o1.getPrice() < o2.getPrice())
            return -1;
        return 0;
    }
}
