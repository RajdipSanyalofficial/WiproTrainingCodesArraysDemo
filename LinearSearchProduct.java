/**
 * Program to search product using Linear search algorithm
 */


package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchProduct {

    static Product linearSearch(Product[] products, String searchName) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName))
                return p;
        }
        return null;
    }
}
