package Services;

import Property.House;
import Property.Human;
import Property.Property;
import Property.Mansion;

import java.util.ArrayList;
import java.util.List;

public class PropertyConverter {
    public static List<Property> StringToProperty(List<String> strings) {
        List<Property> properties = new ArrayList<Property>();
        String[] property;
        Property p;
        for (int i = 0; i < strings.size(); i++) {
            p = new Property();
            property = strings.get(i).split(",");
            p.setCity(property[0]);
            p.setPrice(Integer.parseInt(property[1]));
            p.setOwner(new Human(property[2], property[3],Integer.parseInt(property[4])));
            p.setRenovated(Boolean.parseBoolean(property[5]));
            properties.add(p);
        }
        return properties;
    }
}
