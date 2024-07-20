/**
 * Java Program to slice array contents using various method
 */

package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class SliceArrayDemo {

    public static void print(){
        System.out.println("***** Array Manipulation - Slice Array *****");
    }

    public static int[] sliceArray(int[] marks,int start, int end){
        System.out.println(1);
        return marks;
    }

    public static void main(String[] args) {

        SliceArrayDemo.print();

        int[] marks={10,20,50,20,70,12,89,33,45,90,85};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start and end values for slicing array contents :");

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int[] slicedArray = sliceArray(marks,start,end);

        System.out.println("Sliced Array from position "+start+" to "+(end-1)+" is :"+ Arrays.toString(slicedArray));
    }
}
