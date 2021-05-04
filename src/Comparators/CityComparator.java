package Comparators;

import java.util.Comparator;
import java.util.Properties;
import Property.Property;

public class CityComparator implements Comparator<Property> {
    @Override
    public int compare(Property o1, Property o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
