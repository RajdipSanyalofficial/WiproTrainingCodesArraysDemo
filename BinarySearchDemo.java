/**
 * Binary search is used to search a key element from multiple elements.
 * Binary search is faster than linear search.
 *
 * It implements Divided and Conquer approach
 */


package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

    static int myBinarySearch(int[] marks,int key) {
        int start = 0;
        int end = marks.length - 1;

        while (start <=end)
        {
            int mid=(start+end)/2;
            if(marks[mid]<key)
            {
                start =mid+1; // search in second half of array
            }
            else if(marks[mid]==key)
            {
                return mid; // if element found in mid, return it
            }
            else
            {
                end=mid-1; // search in first half of array

            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] marks={10,20,50,20,70,12,89,33,45,90,85};
        Scanner scanner=new Scanner(System.in);

        Arrays.sort(marks); //For Binary Search Arrays has to be sorted before hand
        System.out.println("Original Array :"+Arrays.toString(marks));

        System.out.println("Enter Element to be Searched :");
        int key=scanner.nextInt();

        int result=myBinarySearch(marks,key); //Invoke method

        if(result==-1)
            System.out.println("Element Not Found : "+key);
        else
            System.out.println("The Element "+key+" found at Position : "+result);
    }
}
