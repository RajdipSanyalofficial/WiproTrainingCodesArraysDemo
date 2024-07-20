/**
 * Program to read Words into Array that will never contain more than 100 words
 */


package arraysdemo;

import java.util.Scanner;

public class ArrayInputOutput2 {
    public static void main(String[] args) {


        String[] words = new String[20];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext() && count < words.length){
            words[count] = scanner.next();
            count++;
        }

        System.out.println("Total Number of Words :" +count);
        System.out.println("The String array contains");

        for(String x:words){
            System.out.println(x);
        }
    }
}
