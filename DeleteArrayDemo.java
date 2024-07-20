/**
 * Java Program to delete elements from array using various methods
 */

package arraysdemo;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteArrayDemo {
    
    public static void main(String[] args)
    {
        int[] marks={10,20,50,20,70,12,89,33,45,90,85};
        Scanner scanner=new Scanner(System.in);

        System.out.println("Original Marks Array : "+ Arrays.toString(marks));

        System.out.println("Enter element to be Deleted :");
        int element=scanner.nextInt();
        scanner.close();

        boolean elementFound= false;

        //Delete Logic
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == element) {
                elementFound = true;
                //Shift the elements in Array
                for (int j = i; j < marks.length - 1; j++) {
                    marks[j] = marks[j + 1];
                }
                break;
            }
        }
        if(!elementFound) {
                System.out.println("Element not Found");
        }
        else{

            System.out.println("Marks Array after deletion of "+element+ " is :");
            for (int i = 0; i < marks.length-1; i++) {
                System.out.print(marks[i]+"\t");
            }

        }

    }
}
