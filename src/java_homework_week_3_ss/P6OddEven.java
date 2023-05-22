package java_homework_week_3_ss;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class P6OddEven {
    public static void main(String[] args) {

        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter the value to check ODD or EVEN number : ");
        int number = c1.nextInt();
        P6OddEven oddEven = new P6OddEven();
        System.out.println(number + " is " + oddEven.isItEvenorOddNumber(number) + " number ");
        c1.close();
    }

        public String isItEvenorOddNumber(int number){
            if (number % 2 == 0) {
                return "Even";
            }else {
                return "Odd";
            }
        }
    }
