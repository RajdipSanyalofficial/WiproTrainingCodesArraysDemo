/**
 *
 */

package arraysdemo;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {

        int[] marks = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements into array");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        System.out.println("The array contains :");
        for (int mark : marks) {
            System.out.print(mark+"\t");
        }
        System.out.println();

        int sum = 0;
        float avg = 0.0f;

        for (int i: marks ){
            sum+=i;
        }

        avg =  (float) sum /marks.length;

        System.out.println("The sum of array elements is :"+sum);
        System.out.println("The average of array elements is :"+avg);
    }
}

