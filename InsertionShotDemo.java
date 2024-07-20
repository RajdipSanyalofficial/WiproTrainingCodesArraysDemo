/**
 * Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list
 *  into its correct position in a sorted portion of the list.
 *  It is a stable sorting algorithm, meaning that elements with equal values maintain their relative order
 *  in the sorted output.
 *
 * Insertion sort is like sorting playing cards in your hands. You split the cards into two groups:
 *  the sorted cards and the unsorted cards.
 *  Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
 */


package arraysdemo;

import java.util.Arrays;

public class InsertionShotDemo {

    public static void main(String[] args) {
        int[] marks = {10, 20, 50, 20, 70, 12, 89, 33, 45, 90, 85};

        System.out.println("Array before Insertion Sort : " + Arrays.toString(marks));
        insertionSort(marks); //invokes insertion sort() method
        System.out.println("Array After Insertion Sort in Ascending order: " + Arrays.toString(marks));
    }

    private static void insertionSort(int[] marks) {

        for (int i = 1; i < marks.length; i++) {//Iterate tru list starting from second element
            int key = marks[i]; //current element to be inserted
            int j = i - 1;  //index of the element before current element

            //Move elements of marks[0...i-1], that are greater than key, to one position ahead of their
            //current position
            while ((j > -1) && (marks[j] > key)) { // 20 10
                marks[j + 1] = marks[j];            // 10 20
                j--;
            }
            marks[j + 1] = key; //Insert key into its correct position in the sorted part of the list
        }


    }
}
