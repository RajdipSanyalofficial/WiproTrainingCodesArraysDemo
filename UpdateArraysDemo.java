/**
 * Program to update elements of array using various method - Set() method
 */

package arraysdemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UpdateArraysDemo {

    public static void main(String[] args)
    {

        String[] languages={"Java","Ruby","Python","C++","Scala","Oak","C"};

        System.out.println("Original Array :");
        for(String x:languages){
            System.out.print(x+"\t");
        }

        //Update Array Contents
        Array.set(languages,2,"SPRING");
        languages[0]="Hibernate";

        System.out.println();
        System.out.println("Array after Update :");
        for(String x:languages){
            System.out.print(x+"\t");
        }
        System.out.println();

        //get() method to access array elements
        System.out.println("The New Elements Updated are : "+Array.get(languages,0));
        System.out.println("The New Elements Updated are : "+Array.get(languages,2));
        System.out.println("The last element in languages Array : "+languages[languages.length-1]);

        int[] marks={10,20,50,20,70};
        int[] scores={100,200,500,600,700};

        System.out.println("Original Marks Array :"+Arrays.toString(marks));
        System.out.println("Original Scores Array :"+Arrays.toString(scores));

        //copies the reference, not Array - marks refers to same array as scores
        marks=scores;

        System.out.println("After copy Marks Array :"+Arrays.toString(marks));
        System.out.println("After Copy Scores Array :"+ Arrays.toString(scores));

        //Update marks Array, but it also updates scores array
        // So to copy contents of Array use copyOf() or ArrayCopy() method
        Array.set(marks,2,999);
        System.out.println("After Update Marks Array :"+Arrays.toString(marks));
        System.out.println("After Update Marks Array, the Scores Array contents:"+Arrays.toString(scores));
    }
}
