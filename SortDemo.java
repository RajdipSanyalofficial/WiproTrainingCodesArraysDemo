/**
 * Java Program to demonstrate in-built Sort() method
 */

package arraysdemo;

import java.util.Arrays;
import java.util.Collections;

public class SortDemo {

    public static void main(String[] args)
    {
        String[] languages={"Java","Ruby","Python","C++","Scala","Oak","C"};
        String[] frameworks={"Struts","Hibernate","Spring","JSF","Grails","GWT","Dropwizard"};

        System.out.println("Original Languages Array :"+ Arrays.toString(languages));
        // Sort in ascending order
        Arrays.sort(languages); //Uses Quick Sort algorithm to sort arrays
        System.out.println("Sorted languages arrays :"+Arrays.toString(languages));

        //Partial Sorting-sort() method is overloaded
        System.out.println("Original \"frameworks\" Array :"+Arrays.toString(frameworks));
        Arrays.sort(frameworks,2,frameworks.length);
        System.out.println("Partially Sorted \"frameworks\" Array from position 2 till" + "end of array :" + Arrays.toString(frameworks));

        //Sort in Descending order

        Arrays.sort(languages, Collections.reverseOrder());
        System.out.println("Sorted languages array in descending order :"+Arrays.toString(languages));


    }
}
