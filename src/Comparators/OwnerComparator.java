package Comparators;

import Property.Property;

import java.util.Comparator;

public class OwnerComparator implements Comparator<Property> {
    @Override
    public int compare(Property o1, Property o2) {
        return o1.getOwner().getName().compareTo(o2.getOwner().getName());
    }
}
