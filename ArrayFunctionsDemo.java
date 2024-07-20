package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctionsDemo {

    public static void main(String[] args)
    {
        int[] n1={22,45,47,12,12,-2};
        int[] n2=new int[5];
        int[] n3=new int[n1.length];

        System.out.println("n1 Array Contents : ");
        for (int k:n1){
            System.out.print(k+"\t");
        }
        System.out.println();

        //ArrayCopy() method to copy Array contents from n1 to n3.
        System.arraycopy(n1,0,n3,0,n1.length);
        System.out.println("n3 array contents after copying :" + Arrays.toString(n3));

        //Copy Array contents Partially
        System.arraycopy(n1,0,n2,3,2);
        System.out.println("n2 array contents after copying :" + Arrays.toString(n2));

        //Copying small Array -  copyOf() method
        int[] copyOfn1=Arrays.copyOf(n1,n1.length);
        System.out.println("New array contents after copying :" + Arrays.toString(copyOfn1));


        //sort the array -> Quick Sort Algorithm
        Arrays.sort(n3);
        System.out.println("n3 array contents after sorting :" + Arrays.toString(n3));

        System.out.println("*********** Binary Search ***********");
        Arrays.sort(copyOfn1); //Array needs to be sorted for binary search() operation


        System.out.println("New Array Contents :"+Arrays.toString(copyOfn1));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements to be searched :");
        int number =sc.nextInt();

        //returns index of number. If duplicates are there it will give index of any one number
        int index=Arrays.binarySearch(copyOfn1,number);//returns index of number

        if(index>0)
            System.out.println("The number "+number+" found at position :"+index);
        else
            System.out.println("Number not found");

        System.out.println("********** fill() ***************");
        Arrays.fill(n2,1000);
        System.out.println("n2 array contents after fill() method :"+Arrays.toString(n2));

        System.out.println("The size of array n2 is :"+n2.length);

    }
}
