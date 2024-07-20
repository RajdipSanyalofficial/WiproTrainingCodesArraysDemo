package arraysdemo;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {

        int[] marks = new int[10];
        String[] names = {"Jack","Mike","Mary"};
        float[] scores;
        scores = new float[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of 10 subjects :");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        System.out.println("The marks of 10 subjects are :");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}

