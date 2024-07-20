/**
 * Java Program to reverse array contents using various methods
 */

package arraysdemo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ReverseArray {

    public static void main(String[] args)
    {

        int[] marks={10,20,50,20,70,12,89,33,45,90,85};

        System.out.println("Original Marks Array : "+ Arrays.toString(marks));

        /*In-place reversal of Array
         * Swap first element with last element, second element with second last element,
         * until we reach the middle of Array */
        for (int i = 0; i < marks.length/2; i++) {
            //swap elements
            int temp=marks[i];
            marks[i]=marks[marks.length-i-1];
            marks[marks.length-i-1]=temp;
        }

        System.out.println("Reversed Marks Array : "+ Arrays.toString(marks));

        String[] students={"Mark","Bill","Lucy","James","Chloe","Gosling","Navin"};

        System.out.println("************ Using Collections.reverse() Method ******************");
        System.out.println("Original Students Array : "+ Arrays.toString(students));

        Collections.reverse(Arrays.asList(students));
        System.out.println("Reversed Students Array : "+ Arrays.toString(students));

    }
}
