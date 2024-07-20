/**
 * Program to display whether each student in class, excluding Lucy has passed their recent test
 */

package arraysdemo;

public class StringArraysDemo {

    public static void main(String [] args)
    {
        String[] students={"Mark","Bill","Lucy","James","Chloe"};
        int[] grades={34,75,0,40,80};

        System.out.println("********** Student List *************");
        for(String x:students){
            System.out.println(x);
        }
        System.out.println("**************************************");
        //Traverse in Array
        for (int i = 0; i < students.length ; i++) {
            if(students[i].equals("Lucy")){
                continue;
            }
            if(grades[i]>=35){
                System.out.println(students[i]+" has Passed the Test with Grade :"+grades[i]);
            }
            else {
                System.out.println(students[i]+" has Failed the Test with Grade :"+grades[i]);
            }
        }
        System.out.println("The Total no. of Students are:"+students.length);
    }
}
