package java_homework_week_3_ss;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class P17SortArrayAndString {

    public static void main(String[] args) {
        int[] numArray = {1200, 5415, 1995, 1929, 707, 1677, 8797, 123 };
        String [] strArray = {"Sarvat", "Jaydeep", "Riya", "Komal","Aarti", "Mukesh", "Jasmeen"};

        System.out.println("Actual Numerical Arrays were : " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Arrays are : " + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Arrays were :  " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted String Arrays are : " + Arrays.toString(strArray));

    }

}
