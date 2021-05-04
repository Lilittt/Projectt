import Comparators.CityComparator;
import Comparators.OwnerComparator;
import Comparators.PriceComparator;
import Property.Property;
import Services.FileService;
import Services.PropertyConverter;
import Services.PropertyService;
import Property.House;
import Property.Property;
import Property.Mansion;
import Property.Human;

import java.util.*;

public class PropertyTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\Lilit\\Desktop\\properties.txt";
        List<String> strings = FileService.read(path);
        List<Property> properties = PropertyConverter.StringToProperty(strings);

        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;


        while (isMenuActive) {
            System.out.println("1. Create property");
            System.out.println("2. Sort property");
            System.out.println("3. Exit");
            int taskNumber = s.nextInt();

            switch (taskNumber) {
                case 1:
                    properties.add(PropertyService.createProperty());
                    break;
                case 2:
                    System.out.println("1. Sort by price and print");
                    System.out.println("2. Sort by city and print");
                    System.out.println("3. Sort by owner's name and print");
                    Scanner p = new Scanner(System.in);
                    int sortNumber = p.nextInt();
                    switch (sortNumber) {
                        case 1:
                            Collections.sort(properties, new PriceComparator());
                            System.out.println(properties);
                            break;
                        case 2:
                            Collections.sort(properties, new CityComparator());
                            System.out.println(properties);
                            break;
                        case 3:
                            Collections.sort(properties, new OwnerComparator());
                            System.out.println(properties);
                            break;
                        default:
                            System.out.println("Invalid task number!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid task number!");
            }
        }
    }
}
