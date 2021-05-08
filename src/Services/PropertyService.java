package Services;

import Property.House;
import Property.Human;
import Property.Property;
import Property.Mansion;

import java.util.Scanner;
import java.util.StringJoiner;

public class PropertyService {
    public static Property createProperty() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter city: ");
        String city = s.next();

        System.out.println("Enter price: ");
        int price = s.nextInt();

        System.out.println("Enter owner's name: ");
        String name = s.next();

        System.out.println("Enter owner's surname: ");
        String surname = s.next();

        System.out.println("Enter owner's age: ");
        int age = s.nextInt();

        System.out.println("Is renovated?: y/n");
        boolean isRenovated = s.next().charAt(0) == 'y';

        Property property = new Property(city, price);
        property.setOwner(new Human(name, surname, age));
        property.setRenovated(isRenovated);
        StringJoiner sj = new StringJoiner(",");
        String str = sj.add(city).add(Integer.toString(price)).add(name).add(surname).add(Integer.toString(age)).add(Boolean.toString(isRenovated)).toString();
        FileService.write("C:\\Users\\Lilit\\Desktop\\properties.txt", "\n" + str);
        return property;
    }
}
