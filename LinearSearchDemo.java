/**
 * Program to search Employee in arrays using Linear Search algorithm
 */

package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemo {

    static int LinearSearchEmployee(String[] employees,String target){

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].equalsIgnoreCase(target)){
                return  i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String[] employees = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        String target;

        Scanner scanner = new Scanner(System.in);

        System.out.println("The employee list : "+ Arrays.toString(employees));

        System.out.println("Enter employee name to search :");
        target = scanner.next();

        int index = LinearSearchEmployee(employees,target);

        if(index != -1)
            System.out.println("Employee "+target+" found at Index :"+index);
        else
            System.out.println("Employee "+target+" not found.");
    }
}


