package java_homework_week_3_ss;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class P1OddOrEvenTernary {

    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in);

        System.out.println("Input the number : ");
        int num = x1.nextInt();
        x1.close();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " number is " + evenOdd);

    }

}
